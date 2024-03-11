package graphics.buttons;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.sql.SQLOutput;

import gameStates.GameStates;
import helper.ImageHandler;

import static helper.UIConstants.Buttons.*;

public class PlayStateButtons {
	private int xPos, yPos, rowIndex, index;
	private int xOffset = 10;
	private int yOffset = 10;
	private GameStates state;
	private BufferedImage img;
	private boolean mouseOver, mousePressed;
	private Rectangle bounds;
	
	public PlayStateButtons(int xPos, int yPos, int rowIndex, GameStates state) {
		this.xPos = xPos + xOffset;
		this.yPos = yPos + yOffset;
		this.rowIndex = rowIndex;
		this.state = state;
		loadImg();
		initBounds();
	}
	
	private void initBounds() {
		bounds = new Rectangle(xPos, yPos, B_WIDTH, B_HEIGHT);
	}
	
	@SuppressWarnings("incomplete-switch")
	private void loadImg() {
		img = ImageHandler.getImage(switch (state) {
			case INVENTORY, MAP -> ImageHandler.TOP_BUTTON_SS;
			case OPTIONS -> ImageHandler.SETTINGS_BUTTON;
			default -> throw new IllegalStateException("Unexpected value: " + state);
		});
	}
	
	public void draw(Graphics g) {
//		System.out.println("PlayStateButtons");
		g.drawImage(img, xPos, yPos, B_WIDTH, B_HEIGHT, null);
	}
	
	public void update() {
		index = 0;
		if (mouseOver)
			index = 1;
		if (mousePressed)
			index = 2;
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
	
	public Rectangle getBounds() {
		return bounds;
	}
	
	public void applyGamestate() {
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
