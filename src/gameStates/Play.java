package gameStates;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import data.Room;
import graphics.buttons.ButtonTypes;
import graphics.buttons.Button;
import graphics.buttons.ChoiceButton;
import main.Game;

import static helper.UIConstants.Buttons.X_OFFSETS;
import static helper.UIConstants.Buttons.Y_OFFSETS;
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
		choices[0] = new ChoiceButton(0, SCALED_HEIGHT, ButtonTypes.CHOICE, GameStates.PLAY, Room.PLACEHOLDER, 0);
	}
	
	@Override
	public void update() {
		for (Button b : buttons)
			b.update();
		choices[0].update();
	}
	
	@Override
	public void draw(Graphics g) {
		currentRoom.draw(g);
		for (Button b : buttons)
			b.draw(g);
		choices[0].draw(g);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		for (Button b : buttons) {
			if (b.isIn(e)) {
				b.setMousePressed(true);
			}
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		for (Button b : buttons) {
			if (b.isIn(e)) {
				if (b.isMousePressed())
					b.applyGameStates();
				break;
			}
		}
		resetButtons();
		System.out.println(GameStates.state);
	}
	
	private void resetButtons() {
		for (Button b : buttons)
			b.resetBools();
		
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
