package gameStates;

import data.Clues;
import data.Rooms;
import graphics.buttons.BackButton;
import graphics.buttons.ButtonTypes;
import graphics.buttons.Button;
import helper.ImageHandler;
import main.Game;
import main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static data.Clues.*;
import static gameStates.GameStates.prevState;
import static gameStates.Play.newClue;
import static helper.UIConstants.Buttons.GuessButtons.GUESS_WIDTH;
import static helper.UIConstants.Buttons.MenuStates.BACK_HEIGHT;
import static helper.UIConstants.Buttons.X_OFFSETS;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.ClueUI.SCALED_HEIGHT;
import static helper.UIConstants.Text.*;
import static main.GamePanel.*;

public class ClueScreen extends State implements GSInterface {
	private BackButton backButton;
	private Button guessButton;
	
	private int guessesLeft = Difficulty.currDiff.numGuesses;
	
//	public static Clues currClue;
//	public static Clues currViewingClue;
	
//	private ClueButton[] clButtons = new ClueButton[4];
	
	public ClueScreen(Game game) {
		super(game);
		initButtons();
//		System.out.println("Initialize: "+cluesFound);
	}
	
	private void initButtons() {
		backButton = new BackButton(X_OFFSETS, SCREEN_HEIGHT - BACK_HEIGHT - Y_OFFSETS, ButtonTypes.BACK, prevState);
//		int i = 0;
//		for (; i < cluesFound.size(); i++)
//			clButtons[i] = new ClueButton(0, 350 - (CLUE_HEIGHT * (i+1)), ButtonTypes.CLUE_BUTTON, cluesFound.get(i));
//		for (; i < clueList.size(); i++)
//			clButtons[i] = new ClueButton(0, 350 - (CLUE_HEIGHT * (i+1)), ButtonTypes.CLUE_BUTTON, clueList.get(i - cluesFound.size()));
		guessButton = new Button(SCREEN_WIDTH - GUESS_WIDTH - GUESS_WIDTH/6, (int)(SCREEN_HEIGHT/2.75), ButtonTypes.GUESS_BUTTON, GameStates.PLAY) {
			@Override
			public void applyStateChange() {
//				System.out.println("Clue Changed");
//				System.out.println("Before Change: "+cluesFound);
				Clues.findClue();
				newClue = true;
//				System.out.println("After Change: "+cluesFound);
//				System.out.println(clueList);
			}
		};
	}
	
	@Override
	public void update() {
		backButton.update();
		guessButton.update();
		if (clueList.isEmpty())
			GameStates.applyStateChange(GameStates.END_STATE);
		if (guessesLeft == 0) {
			EndGame.isDead = true;
			GameStates.applyStateChange(GameStates.END_STATE);
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(ImageHandler.getImage(ImageHandler.CLUE_PAPER), SCREEN_WIDTH/2 - SCREEN_WIDTH/4, 0, SCREEN_WIDTH/2, SCALED_HEIGHT, null);
//		for (ClueButton cb : clButtons)
//			cb.draw(g);
		Font f = font.deriveFont(CLUE_PX);
		g.setFont(f);
		GamePanel.drawWrappedString(g, cluesFound.peek().getDesc(), CLUE_TEXT_X, CLUE_TEXT_Y, CLUE_TEXT_WIDTH, f);
		GamePanel.drawWrappedString(g, "Total Guesses Left:\n " + guessesLeft, SCREEN_WIDTH - GUESS_WIDTH - GUESS_WIDTH/4, Y_OFFSETS, 100, f);
//		g.fillRect(345, 0, 5, 400);
		backButton.draw(g);
		guessButton.draw(g);
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (backButton.isIn(e))
			backButton.setMousePressed(true);
		if (guessButton.isIn(e))
			guessButton.setMousePressed(true);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if (backButton.isIn(e)) {
			if (backButton.isMousePressed())
				backButton.applyStateChange();
		}
		
		if (guessButton.isIn(e)) {
			if (guessButton.isMousePressed()) {
				if (cluesFound.peek().getNext().equals(Rooms.currRoomID))
					guessButton.applyStateChange();
				else
					guessesLeft--;
			}
		}
		
		guessButton.resetBools();
		backButton.resetBools();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		backButton.escBack(e);
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
}
