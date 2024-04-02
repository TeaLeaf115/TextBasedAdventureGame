package graphics.buttons;

//import data.Room;
import data.Rooms;
import gameStates.GameStates;
import gameStates.Play;
import main.GamePanel;

import java.awt.*;

import static helper.UIConstants.Buttons.X_OFFSETS;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Text.CHOICE_PX;
import static main.GamePanel.font;

public class ChoiceButton extends Button{
	private Rooms room;
	private int choiceNum;
	public ChoiceButton(int xPos, int yPos, ButtonTypes type, int choiceNum) {
		super(xPos, yPos, type, GameStates.PLAY);
		this.choiceNum = choiceNum;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(type.img, xPos, yPos, type.width, type.height, null);
//		g.setColor(switch (choiceNum) {
//			case 0 -> Color.BLUE;
//			case 1-> Color.RED;
//			case 2 -> Color.YELLOW;
//			case 3 -> Color.green;
//			default -> throw new IllegalStateException("Unexpected value: " + choiceNum);
//		});
//		g.fillRect(xPos, yPos, type.width, type.height);
		Font f = font.deriveFont(CHOICE_PX);
		g.setFont(f);
		GamePanel.drawWrappedString(g, Play.rooms.getChoices()[choiceNum].getDesc(), xPos + X_OFFSETS, (int)(yPos +CHOICE_PX) + Y_OFFSETS, type.width - 8, f);
	}
	
	@Override
	public void applyStateChange() {
		String nextRoom = Play.rooms.getChoices()[choiceNum].getNextRoom();
		System.out.println("Changed to Room: " + nextRoom);
		if (nextRoom != null)
			Play.rooms.changeRoom(nextRoom);
	}
}