package gameStates;

import graphics.buttons.Button;
import helper.ImageHandler;
import main.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static graphics.buttons.ButtonTypes.*;
import static helper.SaveAndLoad.Load;
import static helper.UIConstants.Buttons.MenuStates.*;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Menu.*;
import static main.GamePanel.SCREEN_WIDTH;

public class MainMenu extends State implements GSInterface {
	
	private Button[] buttons = new Button[4];
	public MainMenu(Game game) {
		super(game);
		loadButtons();
	}
	
	private void loadButtons() {
		buttons[0] = new Button(SCREEN_WIDTH/2 - NEW_GAME_WIDTH/2, TITLE_Y + TITLE_HEIGHT + 2*Y_OFFSETS, NEW_GAME, GameStates.DIFF_SELECTION);
		buttons[1] = new Button(SCREEN_WIDTH/2 - LOAD_GAME_WIDTH/2, TITLE_Y + TITLE_HEIGHT + 3*Y_OFFSETS + NEW_GAME_HEIGHT, LOAD_FROM_SAVE, GameStates.PLAY) {
			@Override
			public void applyStateChange() {
				super.applyStateChange();
				Load();
				Game.playing = new Play(game);
			}
		};
		buttons[2] = new Button(SCREEN_WIDTH/2 - SAVE_AND_QUIT_WIDTH/2, TITLE_Y + TITLE_HEIGHT + 4*Y_OFFSETS + NEW_GAME_HEIGHT + LOAD_GAME_HEIGHT, SAVE_AND_EXIT, GameStates.SAVE_AND_QUIT);
		buttons[3] = new Button(SCREEN_WIDTH/2 - CREDITS_WIDTH/2, TITLE_Y + TITLE_HEIGHT + 5*Y_OFFSETS + NEW_GAME_HEIGHT + LOAD_GAME_HEIGHT + SAVE_AND_QUIT_HEIGHT, CREDITS, GameStates.CREDITS);
	}
	
	@Override
	public void update() {
		for (Button b : buttons)
			b.update();
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(ImageHandler.getImage(ImageHandler.TITLE_LOGO), TITLE_X, TITLE_Y, TITLE_WIDTH, TITLE_HEIGHT, null);
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
				if (b.isMousePressed())
					b.applyStateChange();
				break;
			}
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		for (Button b : buttons)
			b.resetBools();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
}
