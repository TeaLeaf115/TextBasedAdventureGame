package gameStates;

import graphics.buttons.Button;
import graphics.buttons.ButtonTypes;
import main.Game;
import main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static gameStates.Difficulty.currDiff;
import static helper.UIConstants.Buttons.MenuStates.CREDITS_WIDTH;
import static helper.UIConstants.Text.*;
import static main.GamePanel.*;

public class Options extends State implements GSInterface {
	private final Button[] buttons = new Button[3];
	
	public Options(Game game) {
		super(game);
		initButtons();
	}
	
	private void initButtons() {
		buttons[0] = new Button(SCREEN_WIDTH/2 - CREDITS_WIDTH/2, SCREEN_HEIGHT/3, ButtonTypes.CREDITS, GameStates.CREDITS);
		buttons[1] = new Button(SCREEN_WIDTH/2 - CREDITS_WIDTH/2, SCREEN_HEIGHT/2, ButtonTypes.SAVE_AND_EXIT, GameStates.SAVE_AND_QUIT);
		buttons[2] = new Button(SCREEN_WIDTH/2 - CREDITS_WIDTH/2, SCREEN_HEIGHT - SCREEN_HEIGHT/3, ButtonTypes.BACK, GameStates.PLAY);
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
				
				       Options
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
	}
	
	private void resetButtons() {
		for (Button b : buttons)
			b.resetBools();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		buttons[2].applyStateChange();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
}
