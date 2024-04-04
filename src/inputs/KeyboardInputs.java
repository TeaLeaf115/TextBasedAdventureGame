package inputs;

import gameStates.GameStates;
import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
	private final GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void keyReleased(KeyEvent e) {
		switch (GameStates.state) {
			case STARTUP -> gamePanel.getGame().getStartup().keyReleased(e);
			case MAIN_MENU -> gamePanel.getGame().getMenu().keyReleased(e);
			case DIFF_SELECTION -> gamePanel.getGame().getDiffSelector().keyReleased(e);
			case PLAY -> gamePanel.getGame().getPlaying().keyReleased(e);
			case INVENTORY, MAP -> {}
			case CLUES -> gamePanel.getGame().getClueScreen().keyReleased(e);
			case OPTIONS -> gamePanel.getGame().getOptions().keyReleased(e);
			case CREDITS -> gamePanel.getGame().getCredits().keyReleased(e);
			case NEW_GAME_BLURB -> gamePanel.getGame().getNewGameBlurb().keyReleased(e);
		}
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void keyPressed(KeyEvent e) {
		switch (GameStates.state) {
			case STARTUP -> gamePanel.getGame().getStartup().keyPressed(e);
			case MAIN_MENU -> gamePanel.getGame().getMenu().keyPressed(e);
			case DIFF_SELECTION -> gamePanel.getGame().getDiffSelector().keyPressed(e);
			case PLAY -> gamePanel.getGame().getPlaying().keyPressed(e);
			case OPTIONS -> gamePanel.getGame().getOptions().keyPressed(e);
			case INVENTORY, MAP -> {}
			case CLUES -> gamePanel.getGame().getClueScreen().keyPressed(e);
			case CREDITS -> gamePanel.getGame().getCredits().keyPressed(e);
			case NEW_GAME_BLURB -> gamePanel.getGame().getNewGameBlurb().keyPressed(e);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
}
