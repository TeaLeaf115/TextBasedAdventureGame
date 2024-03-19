package gameStates;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import data.Room;
import graphics.buttons.ButtonTypes;
import graphics.buttons.Button;
import graphics.buttons.ChoiceButton;
import main.Game;

import static helper.UIConstants.Buttons.*;
import static helper.UIConstants.Description.BOX_HEIGHT;
import static helper.UIConstants.RoomImage.SCALED_HEIGHT;
import static main.GamePanel.SCREEN_WIDTH;

public class Play extends State implements GSInterface{
	private Button[] buttons = new Button[3];
	private ChoiceButton[] choices = new ChoiceButton[4];
	private Room currentRoom;
	
	public Play(Game game) {
		super(game);
		currentRoom = Room.currRoom;
		loadImg();
		loadButtons();
		loadChoices();
	}
	
	private void loadButtons() {
		buttons[0] = new Button(X_OFFSETS, Y_OFFSETS, ButtonTypes.SETTINGS, GameStates.OPTIONS);
		buttons[1] = new Button(SCREEN_WIDTH-ButtonTypes.INVENTORY.width-ButtonTypes.MAP.width-X_OFFSETS, 0, ButtonTypes.INVENTORY, GameStates.INVENTORY);
		buttons[2] = new Button(SCREEN_WIDTH-ButtonTypes.MAP.width-X_OFFSETS, 0, ButtonTypes.MAP, GameStates.MAP);
	}
	
	private void loadImg() {
	}
	
	private void loadChoices() {
		choices[0] = new ChoiceButton(0, SCALED_HEIGHT + BOX_HEIGHT, ButtonTypes.CHOICE, GameStates.PLAY, Room.PLACEHOLDER, 0);
		choices[1] = new ChoiceButton(CHOICE_WIDTH, SCALED_HEIGHT + BOX_HEIGHT, ButtonTypes.CHOICE, GameStates.PLAY, Room.PLACEHOLDER, 1);
		choices[2] = new ChoiceButton(0, SCALED_HEIGHT + BOX_HEIGHT + CHOICE_HEIGHT, ButtonTypes.CHOICE, GameStates.PLAY, Room.PLACEHOLDER, 2);
		choices[3] = new ChoiceButton(CHOICE_WIDTH, SCALED_HEIGHT + BOX_HEIGHT + CHOICE_HEIGHT, ButtonTypes.CHOICE, GameStates.PLAY, Room.PLACEHOLDER, 3);
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
		System.out.println(Room.currRoom);
		currentRoom.draw(g);
		for (Button b : buttons)
			b.draw(g);
		for (ChoiceButton c : choices)
			c.draw(g);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		for (Button b : buttons) {
			if (b.isIn(e)) {
				b.setMousePressed(true);
			}
		}
		
		for (ChoiceButton c : choices) {
			if (c.isIn(e)) {
				c.setMousePressed(true);
			}
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		for (Button b : buttons) {
			if (b.isIn(e)) {
				if (b.isMousePressed()) {
					b.applyStateChange();
					System.out.println(GameStates.state);
				}
				break;
			}
		}
		for (ChoiceButton c : choices) {
			if (c.isIn(e)) {
				System.out.println(true);
				if (c.isMousePressed()) {
					c.applyStateChange();
					System.out.println(Room.currRoom);
				}
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
	public void mouseClicked(MouseEvent e) {
	
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_C) {
			System.out.println("C");
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
}
