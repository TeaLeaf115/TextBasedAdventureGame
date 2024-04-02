package graphics.buttons;

import gameStates.GameStates;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Button {
	protected int xPos, yPos;
	protected GameStates state;
	protected ButtonTypes type;
	protected boolean mouseOver, mousePressed;
	protected Rectangle bounds;
	
	
	
	public Button(int xPos, int yPos, ButtonTypes type, GameStates state) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.type = type;
		initBounds();
		this.state = state;
//		System.out.println(type + ": " +  this.bounds.getBounds());
	}
	
	private void initBounds() {
		this.bounds = new Rectangle(xPos, yPos, type.width, type.height);
	}
	
	public void draw(Graphics g) {
		g.drawImage(type.img, xPos, yPos, type.width, type.height, null);
	}
	
	public void update() {
	}
	
	public boolean isIn(MouseEvent e) {
		return this.bounds.contains(e.getX(), e.getY());
	}
	
	public boolean isMouseOver() {
		return mouseOver;
	}
	
	public void setMouseOver(boolean mouseOver) {
		this.mouseOver = mouseOver;
	}
	
	public boolean isMousePressed() {
		return mousePressed;
	}
	
	public void setMousePressed(boolean mousePressed) {
		this.mousePressed = mousePressed;
	}
	
	public void applyStateChange() {
		GameStates.applyStateChange(state);
	}
	
	public void resetBools() {
		mouseOver = false;
		mousePressed = false;
	}
	public GameStates getState() {
		return state;
	}
	
	public ButtonTypes getType() {
		return type;
	}
}
