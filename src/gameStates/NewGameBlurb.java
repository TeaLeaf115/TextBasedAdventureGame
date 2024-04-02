package gameStates;

import graphics.buttons.Button;
import graphics.buttons.ButtonTypes;
import main.Game;
import main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static helper.UIConstants.Buttons.X_OFFSETS;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Text.*;
import static main.GamePanel.*;

public class NewGameBlurb extends State implements GSInterface {
	private Button contButton;
	public NewGameBlurb(Game game) {
		super(game);
		initButtons();
	}
	
	private void initButtons() {
		contButton = new Button(SCREEN_WIDTH - ButtonTypes.CONTINUE.width - X_OFFSETS*2, SCREEN_HEIGHT - ButtonTypes.CONTINUE.height - Y_OFFSETS*2, ButtonTypes.CONTINUE, GameStates.PLAY);
	}
	
	@Override
	public void update() {
		contButton.update();
	}
	
	@Override
	public void draw(Graphics g) {
		Font f = font.deriveFont(NEW_GAME_PX);
		g.setFont(f);
		GamePanel.drawWrappedString(g,
				"""
				You are invited to a fancy mansion for a work party from one of your higher up’s in management. Once you arrive at the mansion along some of the other guests, you find that the premises has gone on lockdown because of a reason that is unclear to you at the moment. You need to search the mansion and grounds to find clues to try to escape and make it out alive.
				
				You're running around until you find a sheet of paper with some words on it.
				
				Good Luck.
				""",
				NEW_GAME_TEXT_X,
				NEW_GAME_TEXT_Y,
				SCREEN_WIDTH - NEW_GAME_TEXT_X,
				f);
		
		contButton.draw(g);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (contButton.isIn(e))
			contButton.setMousePressed(true);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if (contButton.isIn(e)) {
			if (contButton.isMousePressed())
				contButton.applyStateChange();
		}
		contButton.resetBools();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
}
