package gameStates;

import graphics.buttons.BackButton;
import graphics.buttons.ButtonTypes;
import main.Game;
import main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Text.*;
import static main.GamePanel.*;

public class Credits extends State implements GSInterface {
	private BackButton backButton;
	
	public Credits(Game game) {
		super(game);
		loadButtons();
	}
	
	private void loadButtons() {
		backButton = new BackButton(SCREEN_WIDTH/2 - ButtonTypes.BACK.width/2, SCREEN_HEIGHT - SCREEN_HEIGHT/6 + Y_OFFSETS, ButtonTypes.BACK, GameStates.prevState);
	}
	
	@Override
	public void update() {
		backButton.update();
	}
	
	@Override
	public void draw(Graphics g) {
		Font f = font.deriveFont(CREDITS_PX);
		g.setFont(f);
		GamePanel.drawWrappedString(g,
"""
              ======  CREDITS  ======
                     
  Lead Designer •••••••••••••••••••••• TeaLeaf115
  Lead Programmer •••••••••••••••••••• TeaLeaf115
  Lead Artist •••••••••••••••••••••••• TeaLeaf115
  Lead Story Writer •••••••••••••••••• TeaLeaf115
  Room Descriptions •••••••••••••••••• TeaLeaf115,
                                       PlumbobPancake
  Clues •••••••••••••••••••••••••••••• TeaLeaf115,
                                       DuckMan

           ------  Other Credit  ------
                 
  RAMhattan Project for assistance with debugging
My Family for letting me hog the only desktop to get
                   this done
        My Father for helping with debugging
""",
				CREDITS_TEXT_X,
				CREDITS_TEXT_Y,
				CREDITS_TEXT_WIDTH,
				f);
		
		backButton.draw(g);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (backButton.isIn(e))
			backButton.setMousePressed(true);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if (backButton.isIn(e)) {
			if (backButton.isMousePressed())
				backButton.applyStateChange();
		}
		backButton.resetBools();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		backButton.escBack(e);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
}
