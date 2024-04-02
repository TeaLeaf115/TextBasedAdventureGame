package gameStates;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import data.Clues;
import data.Rooms;
import graphics.buttons.ButtonTypes;
import graphics.buttons.Button;
import graphics.buttons.ChoiceButton;
import helper.ImageHandler;
import main.Game;

import static data.Rooms.currRoomID;
import static helper.SaveAndLoad.loadedFromSave;
import static helper.UIConstants.Buttons.PlayState.*;
import static helper.UIConstants.Buttons.*;
import static helper.UIConstants.Description.BOX_HEIGHT;
import static helper.UIConstants.RoomImage.SCALED_HEIGHT;
import static main.GamePanel.SCREEN_WIDTH;

public class Play extends State implements GSInterface{
	private Button[] buttons = new Button[2];
	private ChoiceButton[] choices = new ChoiceButton[4];
	public static Rooms rooms;
	public static boolean newClue = true;
	
	public Play(Game game) {
		super(game);
		if (!loadedFromSave) {
			Clues.initClues();
			Clues.findClue();
		}
		System.out.println("Successfully Loaded Clues");
		rooms = new Rooms();
		System.out.println("Loaded into Room: " + currRoomID);
		loadButtons();
		loadChoices();
	}
	
	private void loadButtons() {
		buttons[0] = new Button(X_OFFSETS, Y_OFFSETS, ButtonTypes.SETTINGS, GameStates.OPTIONS);
		buttons[1] = new Button(SCREEN_WIDTH-ButtonTypes.CLUE_MENU.width-ButtonTypes.MAP.width-X_OFFSETS, 0, ButtonTypes.CLUE_MENU, GameStates.CLUES);
	}
	
	private void loadChoices() {
		choices[0] = new ChoiceButton(0, SCALED_HEIGHT + BOX_HEIGHT, ButtonTypes.CHOICE, 0);
		choices[1] = new ChoiceButton(CHOICE_WIDTH, SCALED_HEIGHT + BOX_HEIGHT, ButtonTypes.CHOICE, 1);
		choices[2] = new ChoiceButton(0, SCALED_HEIGHT + BOX_HEIGHT + CHOICE_HEIGHT, ButtonTypes.CHOICE, 2);
		choices[3] = new ChoiceButton(CHOICE_WIDTH, SCALED_HEIGHT + BOX_HEIGHT + CHOICE_HEIGHT, ButtonTypes.CHOICE, 3);
	}
	
	@Override
	public void update() {
		for (Button b : buttons)
			b.update();
		
		for (ChoiceButton c : choices)
			c.update();
	}
	
	@Override
	public void draw(Graphics g) {
		rooms.draw(g);
		for (Button b : buttons)
			b.draw(g);
		if (newClue)
			g.drawImage(ImageHandler.getImage(ImageHandler.NEW_CLUE_NOTIF),
					SCREEN_WIDTH-ButtonTypes.CLUE_MENU.width-ButtonTypes.MAP.width-(int)(X_OFFSETS*1.5),
					Y_OFFSETS*2, null);
		
		for (ChoiceButton c : choices)
			c.draw(g);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("X: " + e.getX() + " || Y: " + e.getY());
		for (Button b : buttons) {
			if (b.isIn(e))
				b.setMousePressed(true);
		}
		
		for (ChoiceButton c : choices) {
			if (c.isIn(e))
				c.setMousePressed(true);
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		for (Button b : buttons) {
			if (b.isIn(e)) {
				if (b.isMousePressed())
					if (b.getType() == ButtonTypes.CLUE_MENU)
						newClue = false;
					b.applyStateChange();
				break;
			}
		}
		
		for (ChoiceButton c : choices) {
			if (c.isIn(e)) {
				if (c.isMousePressed())
					c.applyStateChange();
				break;
			}
		}
		resetButtons();
	}
	
	private void resetButtons() {
		for (Button b : buttons)
			b.resetBools();
		
		for (ChoiceButton c : choices)
			c.resetBools();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_C)
			System.out.println("C");
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
}
