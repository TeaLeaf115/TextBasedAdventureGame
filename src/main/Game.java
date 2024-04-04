package main;

import data.Seed;
import gameStates.*;
import helper.SaveAndLoad;

import java.awt.*;

import static data.Seed.seed;
import static main.GamePanel.SCREEN_HEIGHT;
import static main.GamePanel.SCREEN_WIDTH;

public class Game implements Runnable {
	private final GamePanel gamePanel;
	private Thread gameThread;
	private final int FPS = 60;
	public static float WIDTH_SCALE = 1.0f;
	public static float HEIGHT_SCALE = 1.0f;
	
	private Startup startup;
	private MainMenu mainMenu;
	private Options options;
	private DiffSelector diffSelector;
	public static ClueScreen clueScreen;
	private Credits credits;
	public static Play playing;
	private NewGameBlurb newGameBlurb;
	private EndGame endGame;
	
	public Game() {
		initClasses();
		gamePanel = new GamePanel(this);
		new GameWindow(gamePanel);
		gamePanel.requestFocus();
		startGameLoop();
		System.out.println("Seed: " + seed);
	}
	
	private void initClasses() {
		startup = new Startup(this);
		new Seed();
		mainMenu = new MainMenu(this);
		options = new Options(this);
		diffSelector = new DiffSelector(this);
		newGameBlurb = new NewGameBlurb(this);
		playing = new Play(this);
		clueScreen = new ClueScreen(this);
		credits = new Credits(this);
		endGame = new EndGame(this);
	}
	
	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
		System.out.println("Game Loop Started");
	}
	
	public void render(Graphics g) {
		switch (GameStates.state) {
			case STARTUP -> startup.draw(g);
			case MAIN_MENU -> mainMenu.draw(g);
			case DIFF_SELECTION -> diffSelector.draw(g);
			case PLAY -> playing.draw(g);
			case CLUES -> clueScreen.draw(g);
			case OPTIONS -> options.draw(g);
			case CREDITS -> credits.draw(g);
			case NEW_GAME_BLURB -> newGameBlurb.draw(g);
			case END_STATE -> endGame.draw(g);
			case INVENTORY, MAP, SAVE_AND_QUIT -> {}
		}
	}
	
	public void update() {
		updateScreen();
		switch (GameStates.state) {
			case STARTUP -> startup.update();
			case MAIN_MENU -> mainMenu.update();
			case DIFF_SELECTION -> diffSelector.update();
			case PLAY -> playing.update();
			case INVENTORY, MAP -> {}
			case CLUES -> clueScreen.update();
			case OPTIONS -> options.update();
			case CREDITS -> credits.update();
			case NEW_GAME_BLURB -> newGameBlurb.update();
			case END_STATE -> endGame.update();
			case SAVE_AND_QUIT -> {
				SaveAndLoad.Save();
				System.out.println("Window Closed");
				System.exit(0);
			}
		}
	}
	
	@Override
	public void run() {
		// 1 Billion nsec or 1 sec divided by the amount of FPS, giving us how many FPS
		// we will get in nanoseconds.
		double drawInterval = (double) 1000000000/* nanoseconds */ / FPS;
		// 'delta' id the time period between the last frame and the current frame.
		double delta = 0;
		// The time, in nanoseconds, as the "last frame" to start the game loop.
		long lastFrame = System.nanoTime();
		// The declaration of the 'currentFrame' variable, used to calculate the delta
		// time in the game loop.
		long currentFrame;
		
		// While the 'gameThread' is running, do the loop.
		while (gameThread != null) {
			// Sets the current time, in nanoseconds, for the current frame to calculate
			// 'delta'.
			currentFrame = System.nanoTime();
			// Adds the time difference between 'currentFrame' and 'lastFrame', then divides
			// it by the drawing interval to 'delta'.
			delta += (currentFrame - lastFrame) / drawInterval;
			// Sets time of the last frame to what the time of the current frame was.
			lastFrame = currentFrame;
			
			// If 'delta' is greater than or equal to 1, then update the display and
			// subtract one from 'delta'.
			if (delta >= 1) {
				update();
				gamePanel.repaint();
//				System.out.println("In DeltaLoop");
				delta--;
			}
		}
	}
	
	public Startup getStartup() {
		return startup;
	}
	public Options getOptions() {
		return options;
	}
	
	public ClueScreen getClueScreen() {
		return clueScreen;
	}
	
	public Credits getCredits() {
		return credits;
	}
	
	public DiffSelector getDiffSelector() {
		return diffSelector;
	}
	public Play getPlaying() {
		return playing;
	}
	
	public MainMenu getMenu() {
		return mainMenu;
	}
	
	public NewGameBlurb getNewGameBlurb() {
		return newGameBlurb;
	}
	public EndGame getEndGame() {
		return endGame;
	}
	
	public void updateScreen() {
		gamePanel.update();
		WIDTH_SCALE = SCREEN_WIDTH / 700f;
		HEIGHT_SCALE = SCREEN_HEIGHT / 400f;
	}
}
