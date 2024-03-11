package gameStates;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import data.Room;
import data.RoomList;
import graphics.buttons.PlayStateButtons;
import main.Game;

import static data.RoomList.PLACEHOLDER;
import static main.GamePanel.SCREEN_WIDTH;

public class Play extends State implements GSInterface{
	private PlayStateButtons[] buttons = new PlayStateButtons[3];
	private Room currentRoom;
	
	public Play(Game game) {
		super(game);
		currentRoom = new Room(RoomList.currRoom);
		loadImg();
		loadButtons();
		loadChoices();
	}
	
	private void loadButtons() {
		buttons[0] = new PlayStateButtons(0, 0, 0, GameStates.OPTIONS);
		buttons[1] = new PlayStateButtons(SCREEN_WIDTH/2, 0, 0, GameStates.MAP);
//		buttons[2] = new PlayStateButtons();
	}
	
	private void loadImg() {
	}
	
	private void loadChoices() {
	}
	
	@Override
	public void update() {
		buttons[0].update();
		buttons[1].update();
	}
	
	@Override
	public void draw(Graphics g) {
		currentRoom.draw(g);
//		System.out.println("Play");
		buttons[0].draw(g);
		buttons[1].draw(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
}
