package gameStates;

;
import data.Clues;
import graphics.buttons.Button;
import graphics.buttons.ButtonTypes;
import main.Game;
import main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static gameStates.Difficulty.currDiff;
import static helper.SaveAndLoad.loadedFromSave;
import static helper.UIConstants.Text.*;
import static main.GamePanel.*;

public class DiffSelector extends State implements GSInterface {
	Button[] buttons = new Button[2];
	
	public DiffSelector(Game game) {
		super(game);
		initButtons();
	}
	
	private void initButtons() {
		buttons[0] = new Button(SCREEN_WIDTH/2 - DIFF_TEXT_WIDTH /4, SCREEN_HEIGHT/3, ButtonTypes.NORMAL, GameStates.NEW_GAME_BLURB);
		buttons[1] = new Button(SCREEN_WIDTH/2 - DIFF_TEXT_WIDTH /4, SCREEN_HEIGHT - SCREEN_HEIGHT/3, ButtonTypes.HARD, GameStates.NEW_GAME_BLURB);
	}
	
	@Override
	public void update() {
		for (Button b : buttons)
			b.update();
	}
	
	@Override
	public void draw(Graphics g) {
		Font f = font.deriveFont(DIFF_PX);
		g.setFont(f);
		GamePanel.drawWrappedString(g, """
				 Choose a Difficulty
				=====================
				""", DIFF_TEXT_X, DIFF_TEXT_Y, DIFF_TEXT_WIDTH, f);
		for (Button b : buttons)
			b.draw(g);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		for (Button b : buttons) {
			if (b.isIn(e))
				b.setMousePressed(true);
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		for (Button b : buttons) {
			if (b.isIn(e)) {
				if (b.isMousePressed()) {
					if (b.getType() == ButtonTypes.HARD)
						currDiff = Difficulty.HARD;
					System.out.println("Current Difficulty Set to: " + currDiff);
					b.applyStateChange();
				}
				break;
			}
		}
		resetButtons();
		System.out.println(true);
		Clues.clrClues();
		Clues.initClues();
		Clues.findClue();
		Game.clueScreen = new ClueScreen(game);
	}
	
	private void resetButtons() {
		for (Button b : buttons)
			b.resetBools();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
}
