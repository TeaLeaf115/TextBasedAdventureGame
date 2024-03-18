package inputs;

import gameStates.GameStates;
import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	@SuppressWarnings("incomplete-switch")
	@Override
	public void keyReleased(KeyEvent e) {
		switch (GameStates.state) {
//			case MAIN_MENU -> gamePanel.getGame().getMenu().keyReleased(e);
			case PLAY -> gamePanel.getGame().getPlaying().keyReleased(e);
//			case CREDITS -> gamePanel.getGame().getCredits().keyReleased(e);
		}
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void keyPressed(KeyEvent e) {
		switch (GameStates.state) {
//			case MAIN_MENU -> gamePanel.getGame().getMenu().keyPressed(e);
			case PLAY -> gamePanel.getGame().getPlaying().keyPressed(e);
//			case OPTIONS -> gamePanel.getGame().getGameOptions().keyPressed(e);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// Not In Use
	}
}
