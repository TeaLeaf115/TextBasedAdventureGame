package graphics.buttons;

import data.Room;
import gameStates.GameStates;

import java.awt.*;

public class ChoiceButton extends Button{
	private Room room;
	private int choiceNum;
	public ChoiceButton(int xPos, int yPos, ButtonTypes type, GameStates state, Room room, int choiceNum) {
		super(xPos, yPos, type, state);
		this.room = room;
		this.choiceNum = choiceNum;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(type.img, xPos, yPos, type.width, type.height, null);
		main.GamePanel.drawWrappedString(g, room.getRoomDesc(), super.xPos, super.yPos, type.width);
	}
}
