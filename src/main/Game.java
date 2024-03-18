package main;

import data.Seed;
import gameStates.GameStates;
import gameStates.Play;

import java.awt.*;
import java.awt.event.KeyListener;

import static data.Seed.seed;
import static main.GamePanel.SCREEN_WIDTH;

public class Game implements Runnable{
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	private Thread gameThread;
	private final int FPS = 60;
	public static float WIDTH_SCALE = 1.0f;
	public static float HEIGHT_SCALE = 1.0f;
	
	private Play playing;
	
	public Game() {
		initClasses();
		gamePanel = new GamePanel(this);
		new GameWindow(gamePanel);
		gamePanel.requestFocus();
		startGameLoop();
		System.out.println("Seed: " + seed);
	}
	
	private void initClasses() {
		Seed seed = new Seed();
		playing = new Play(this);
	}
	
	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
		System.out.println("Gameloop Started");
	}
	
//	@SuppressWarnings("incomplete-switch")
	public void render(Graphics g) {
		switch (GameStates.state) {
			case STARTUP -> {
			}
			case MAIN_MENU -> {
			}
			case PLAY -> {
				playing.draw(g);
			}
			case INVENTORY -> {
			}
			case MAP -> {
			}
			case OPTIONS -> {
			}
			case CREDITS -> {
			}
		}
	}
	
	@SuppressWarnings("incomplete-switch")
	public void update() {
		updateScreen();
		switch (GameStates.state) {
			case STARTUP -> {
			}
			case MAIN_MENU -> {
			
			}
			case PLAY -> {
				playing.update();
			}
			case INVENTORY -> {
			}
			case MAP -> {
			}
			case OPTIONS -> {
			}
			case CREDITS -> {
			}
			case SAVE_AND_QUIT -> {
				System.exit(0);
			}
		}
	}
	
	@Override
	public void run() {
		// 1 Billion nsec or 1 sec divided by the amount of FPS, giving us how many FPS
		// we will get in nanoseconds.
		double drawInterval = 1000000000/* nanoseconds */ / FPS;
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
	
	public Play getPlaying() {
		return playing;
	}
	
	public void updateScreen() {
		gamePanel.update();
		WIDTH_SCALE = SCREEN_WIDTH / 700f;
		
		System.out.println("SCREEN_WIDTH: " + SCREEN_WIDTH);
		System.out.println("WIDTH_SCALE: " + WIDTH_SCALE);
	}
}
