package graphics.buttons;

import data.Room;
import gameStates.GameStates;

import java.awt.*;

import static helper.UIConstants.Buttons.X_OFFSETS;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Text.CHOICE_PX;
import static main.GamePanel.font;

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
		Font f = font.deriveFont(CHOICE_PX);
		g.setFont(f);
		main.GamePanel.drawWrappedString(g, room.getChoice(choiceNum).getDesc(), xPos + X_OFFSETS, (int)(yPos +CHOICE_PX) + Y_OFFSETS, type.width - 8, f);
	}
	
	@Override
	public void applyStateChange() {
		Room.currRoom = room.getChoice(choiceNum).getNextRoom();
	}
}