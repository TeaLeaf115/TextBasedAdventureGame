package gameStates;

import helper.ImageHandler;
import main.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import static main.GamePanel.SCREEN_HEIGHT;
import static main.GamePanel.SCREEN_WIDTH;

public class Startup extends State implements GSInterface {
	private BufferedImage image;
	private float alpha = 0.0f; // Initial alpha value for fade-in
	private int fadeInDuration = 3000; // Duration of fade-in in milliseconds
	private int holdDuration = 2000; // Duration of hold in milliseconds
	private int fadeOutDuration = 3000; // Duration of fade-out in milliseconds
	private int startDelay = 1500; // Delay before fade-in starts in milliseconds
	private int endDelay = 1250; // Delay before transitioning to the main menu state in milliseconds
	private long startTime; // Start time of the state
	
	public Startup(Game game) {
		super(game);
		this.image = ImageHandler.getImage(ImageHandler.RAMhattanProject_logo);
		startTime = System.currentTimeMillis();
	}
	
	public void update() {
		long elapsedTime = System.currentTimeMillis() - startTime - startDelay;
		
		if (elapsedTime < fadeInDuration)
			alpha = (float) elapsedTime / fadeInDuration;
		else if (elapsedTime < fadeInDuration + holdDuration) {}
		else if (elapsedTime < fadeInDuration + holdDuration + fadeOutDuration)
			alpha = 1.0f - ((float) (elapsedTime - (fadeInDuration + holdDuration)) / fadeOutDuration);
		else {
			try {
				Thread.sleep(endDelay);
				GameStates.applyStateChange(GameStates.MAIN_MENU);
			} catch (InterruptedException ignored) {}
		}
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		// Apply transparency (alpha) to the image
		try {
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
		} catch (Exception ignored) {
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0f));
		}
		// Draw the image
		g2d.drawImage(image, SCREEN_WIDTH/2 - 312/2, SCREEN_HEIGHT/2 - 312/2, 312, 312, null);
		g2d.dispose();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		GameStates.applyStateChange(GameStates.MAIN_MENU);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
}