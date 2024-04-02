package graphics.buttons;

import data.Clues;
import gameStates.GameStates;

import java.awt.*;

//import static gameStates.ClueScreen.currClue;

public class ClueButton extends Button {
	private Clues cl;
	private int clueNum;
	
	public ClueButton(int xPos, int yPos, ButtonTypes type, Clues cl) {
		super(xPos, yPos, type, GameStates.CLUES);
		this.cl = cl;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(type.img, xPos, yPos, type.width, type.height, null);
		
	}
	
	public String getDesc() {
		return cl.getDesc();
	}
}
