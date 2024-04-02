package graphics.buttons;

import gameStates.GameStates;

import java.awt.event.KeyEvent;

public class BackButton extends Button{
	public BackButton(int xPos, int yPos, ButtonTypes type, GameStates state) {
		super(xPos, yPos, type, state);
	}
	
	@Override
	public void applyStateChange() {
		GameStates.applyStateChange(GameStates.prevState);
	}
	
	public void escBack(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
			applyStateChange();
	}
}
