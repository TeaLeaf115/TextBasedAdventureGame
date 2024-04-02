package gameStates;

import graphics.buttons.Button;
import graphics.buttons.ButtonTypes;
import main.Game;
import main.GamePanel;
import main.Main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static gameStates.Play.newClue;
import static helper.UIConstants.Buttons.GameOverButton.GAME_OVER_WIDTH;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Text.DIFF_PX;
import static main.GamePanel.*;

public class EndGame extends State implements GSInterface {
	public static boolean isDead = false;
	Button playAgain;
	public EndGame(Game game) {
		super(game);
		initButtons();
	}
	
	public void initButtons() {
		playAgain = new Button(SCREEN_WIDTH/2 - GAME_OVER_WIDTH/2, SCREEN_HEIGHT/2 + Y_OFFSETS*2, ButtonTypes.RESTART_BUTTON, GameStates.STARTUP) {
			@Override
			public void applyStateChange() {
				super.applyStateChange();
				newClue = true;
				new Main();
			}
		};
	}
	
	@Override
	public void update() {
		playAgain.update();
	}
	
	@Override
	public void draw(Graphics g) {
		Font f = font.deriveFont(48f);
		g.setFont(f);
		g.drawString(isDead ? "  You Died." : " You Escaped!", SCREEN_WIDTH/15, SCREEN_HEIGHT/4);
		f = font.deriveFont(12f);
		g.setFont(f);
		GamePanel.drawWrappedString(g, isDead ? "You didn't find a way to escape in enough time and the werewolf found you." : "      You found a way out of the mansion alive!!", SCREEN_WIDTH/15, SCREEN_HEIGHT/2 - Y_OFFSETS*4, 650, f);
		playAgain.draw(g);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (playAgain.isIn(e))
			playAgain.setMousePressed(true);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if (playAgain.isIn(e)) {
			if (playAgain.isMousePressed())
				playAgain.applyStateChange();
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
}
