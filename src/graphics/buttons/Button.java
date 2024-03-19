package graphics.buttons;

import gameStates.GameStates;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Button {
	protected int xPos, yPos;
	protected GameStates state;
	protected ButtonTypes type;
	protected boolean mouseOver, mousePressed;
	
	
	public Button(int xPos, int yPos, ButtonTypes type, GameStates state) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.type = type;
		initBounds();
		this.state = state;
		System.out.println(type.bounds.getBounds());
	}
	
	private void initBounds() {
		type.bounds.setLocation(xPos, yPos);
	}
	
	public void draw(Graphics g) {
		g.drawImage(type.img, xPos, yPos, type.width, type.height, null);
	}
	
	public void update() {
	}
	
	public boolean isIn(MouseEvent e) {
		return type.bounds.contains(e.getX(), e.getY());
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
		GameStates.state = state;
	}
	
	public void resetBools() {
		mouseOver = false;
		mousePressed = false;
	}
	public GameStates getState() {
		return state;
	}
}
