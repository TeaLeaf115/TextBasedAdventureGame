package graphics;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Sprite {
	private BufferedImage spriteImage;
	private Point pos;
	private int width;
	private int height;
	private boolean isVisible = true;

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
	
	public boolean getVisibility() {
		return isVisible;
	}

	public void setXY(Point p) {
		pos = p;
	}

	public void translateX(int dx) {
		pos.x += dx;
	}

	public void translateY(int dy) {
		pos.y += dy;
	}

	public void setSpriteImage(BufferedImage img) {
		spriteImage = img;
		this.width = spriteImage.getWidth();
		this.height = spriteImage.getHeight();
	}

	public void scale(double scaleAmount) {
		spriteImage = resize(spriteImage, scaleAmount);
	}

	public void rotate(int degrees) {
		spriteImage = rotate(spriteImage, degrees);
	}

	public void draw(Graphics2D g2) {
		if (isVisible)
			g2.drawImage(spriteImage,
					(int) pos.x, (int) pos.y,
					width, height,
					null);
	}

	public void update() {
	}
	
	public void visible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	private BufferedImage resize(BufferedImage originalImage, int targetWidth, int targetHeight) {
		Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
		BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
		outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
		return outputImage;
	}

	public BufferedImage resize(BufferedImage originalImage, double scale) {
		if (scale <= 0.0)
			throw new IllegalArgumentException("Second parameter has to be a non-negative, non-zero number");
		int oImgWidth = originalImage.getWidth();
		int oImgHeight = originalImage.getHeight();
		Image resultingImage = originalImage.getScaledInstance((int) (oImgWidth * scale), (int) (oImgHeight * scale),
				Image.SCALE_DEFAULT);
		BufferedImage outputImage = new BufferedImage((int) (oImgWidth * scale), (int) (oImgHeight * scale),
				BufferedImage.TYPE_INT_ARGB);
		outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
		return outputImage;
	}

	// Code From Thomas Fritsch
	// (https://stackoverflow.com/questions/44086310/how-to-rotate-a-buffered-image-without-cropping-it-is-there-any-way-to-rotate-a)
	// Modified by me to use 'TYPE_INT_ARGB' instead of 'TYPE_INT_RGB'
	public BufferedImage rotate(BufferedImage originalImage, double degree) {
		int w = originalImage.getWidth();
		int h = originalImage.getHeight();
		double toRad = Math.toRadians(degree);
		int hPrime = (int) (w * Math.abs(Math.sin(toRad)) + h * Math.abs(Math.cos(toRad)));
		int wPrime = (int) (h * Math.abs(Math.sin(toRad)) + w * Math.abs(Math.cos(toRad)));

		BufferedImage rotatedImage = new BufferedImage(wPrime, hPrime, BufferedImage.TYPE_INT_ARGB); // Modified by me
		Graphics2D g = rotatedImage.createGraphics();
		g.setColor(new Color(255, 255, 255, 0)); // Modified by me
		g.fillRect(0, 0, wPrime, hPrime); // fill entire area
		g.translate(wPrime / 2, hPrime / 2);
		g.rotate(toRad);
		g.translate(-w / 2, -h / 2);
		g.drawImage(originalImage, 0, 0, null);
		g.dispose(); // release used resources before g is garbage-collected
		return rotatedImage;
	}
}
