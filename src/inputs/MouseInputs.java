package inputs;

import gameStates.GameStates;
import main.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {
	private GamePanel gamePanel;
	
	public MouseInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseDragged(MouseEvent e) {
//		switch (GameStates.state) {
//			case PLAYING -> gamePanel.getGame().getPlaying().mouseDragged(e);
//			case OPTIONS -> gamePanel.getGame().getGameOptions().mouseDragged(e);
//		}
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseMoved(MouseEvent e) {
		switch (GameStates.state) {
			case STARTUP -> gamePanel.getGame().getStartup().mouseMoved(e);
			case MAIN_MENU -> gamePanel.getGame().getMenu().mouseMoved(e);
			case DIFF_SELECTION -> gamePanel.getGame().getDiffSelector().mouseMoved(e);
			case PLAY -> gamePanel.getGame().getPlaying().mouseMoved(e);
			case INVENTORY, MAP -> {}
			case CLUES -> gamePanel.getGame().getClueScreen().mouseMoved(e);
			case OPTIONS -> gamePanel.getGame().getOptions().mouseMoved(e);
			case CREDITS -> gamePanel.getGame().getCredits().mouseMoved(e);
			case NEW_GAME_BLURB -> gamePanel.getGame().getNewGameBlurb().mouseMoved(e);
			case END_STATE -> gamePanel.getGame().getEndGame().mouseMoved(e);
		}
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseClicked(MouseEvent e) {
		switch (GameStates.state) {
			case STARTUP -> gamePanel.getGame().getStartup().mouseClicked(e);
			case MAIN_MENU -> gamePanel.getGame().getMenu().mouseClicked(e);
			case DIFF_SELECTION -> gamePanel.getGame().getDiffSelector().mouseClicked(e);
			case PLAY -> gamePanel.getGame().getPlaying().mouseClicked(e);
			case INVENTORY, MAP -> {}
			case CLUES -> gamePanel.getGame().getClueScreen().mouseClicked(e);
			case OPTIONS -> gamePanel.getGame().getOptions().mouseClicked(e);
			case CREDITS -> gamePanel.getGame().getCredits().mouseClicked(e);
			case NEW_GAME_BLURB -> gamePanel.getGame().getNewGameBlurb().mouseClicked(e);
			case END_STATE -> gamePanel.getGame().getEndGame().mouseClicked(e);
		}
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void mousePressed(MouseEvent e) {
		switch (GameStates.state) {
			case STARTUP -> gamePanel.getGame().getStartup().mousePressed(e);
			case MAIN_MENU -> gamePanel.getGame().getMenu().mousePressed(e);
			case DIFF_SELECTION -> gamePanel.getGame().getDiffSelector().mousePressed(e);
			case PLAY -> gamePanel.getGame().getPlaying().mousePressed(e);
			case INVENTORY, MAP -> {}
			case CLUES -> gamePanel.getGame().getClueScreen().mousePressed(e);
			case OPTIONS -> gamePanel.getGame().getOptions().mousePressed(e);
			case CREDITS -> gamePanel.getGame().getCredits().mousePressed(e);
			case NEW_GAME_BLURB -> gamePanel.getGame().getNewGameBlurb().mousePressed(e);
			case END_STATE -> gamePanel.getGame().getEndGame().mousePressed(e);
		}
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseReleased(MouseEvent e) {
		switch (GameStates.state) {
			case STARTUP -> gamePanel.getGame().getStartup().mouseReleased(e);
			case MAIN_MENU -> gamePanel.getGame().getMenu().mouseReleased(e);
			case DIFF_SELECTION -> gamePanel.getGame().getDiffSelector().mouseReleased(e);
			case PLAY -> gamePanel.getGame().getPlaying().mouseReleased(e);
			case INVENTORY, MAP -> {}
			case CLUES -> gamePanel.getGame().getClueScreen().mouseReleased(e);
			case OPTIONS -> gamePanel.getGame().getOptions().mouseReleased(e);
			case CREDITS -> gamePanel.getGame().getCredits().mouseReleased(e);
			case NEW_GAME_BLURB -> gamePanel.getGame().getNewGameBlurb().mouseReleased(e);
			case END_STATE -> gamePanel.getGame().getEndGame().mouseReleased(e);
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
}
