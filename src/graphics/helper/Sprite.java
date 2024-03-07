package graphics.helper;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Sprite {
	private BufferedImage spriteImage;
	private Point pos;
	private int width;
	private int height;
	
	public Sprite() {
	}
	
	public Sprite(BufferedImage spriteImage, Point coord) {
		this.spriteImage = spriteImage;
		this.pos = coord;
		this.width = spriteImage.getWidth();
		this.height = spriteImage.getHeight();
	}
	
	public int getX() {
		return (int) pos.x;
	}
	
	public int getY() {
		return (int) pos.y;
	}
	
	public BufferedImage getSpriteImage() {
		return spriteImage;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setXY(Point p) {
		pos = p;
	}
	
	public void setImage(BufferedImage img) {
		spriteImage = img;
		this.width = spriteImage.getWidth();
		this.height = spriteImage.getHeight();
	}
	
	public void scaleSprite(double amt) {
	
	}
	
	public void draw(Graphics2D g2) {
		g2.drawImage(spriteImage,
				(int) pos.x, (int) pos.y,
				width, height,
				null);
	}
	
	public void update() {
	
	}
}
