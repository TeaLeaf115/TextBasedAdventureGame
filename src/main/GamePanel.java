package main;

import helper.UIConstants;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static helper.UIConstants.Text.*;

public class GamePanel extends JPanel {
	public static int SCREEN_WIDTH = 700;
	public static int SCREEN_HEIGHT = 400;
	private MouseInputs mouseInputs;
	private Game game;
	public static Font font;
	
	public GamePanel(Game game) {
		mouseInputs = new MouseInputs(this);
		this.game = game;
		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		this.setBackground(Color.BLACK);
		try {
			// Load the custom font from a file
			font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/prstart.ttf"));
		} catch (IOException | FontFormatException e) {
			e.printStackTrace();
			// Handle font loading error
		}
	}
	
	private void setPanelSize() {
		Dimension size = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.setPreferredSize(size);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.setFont(font.deriveFont(DEFAULT_PX));
		game.render(g);
	}
	
	public void update() {
		SCREEN_WIDTH = getWidth();
		SCREEN_HEIGHT = getHeight();
	}
	
	public Game getGame() {
		return game;
	}
	
	public static void drawWrappedString(Graphics g, String text, int x, int y, int maxLineLength, Font f) {
		// Split the text into lines
		String[] lines = text.split("\n");
		for (String line : lines) {
			// Check if the line fits within the maximum line length
			if (g.getFontMetrics().stringWidth(line) <= maxLineLength) {
				// If it fits, draw the line as is
				g.drawString(line, x, y);
				y += UIConstants.Text.LINE_HEIGHT(f.getSize2D());
			} else {
				// If it doesn't fit, wrap the line
				StringBuilder lineBuilder = new StringBuilder();
				String[] words = line.split("\\s+"); // Split the line into words
				for (String word : words) {
					// Check if adding the current word exceeds the maximum width
					if (g.getFontMetrics().stringWidth(lineBuilder + " " + word) > maxLineLength) {
						// Draw the current line and reset line StringBuilder
						g.drawString(lineBuilder.toString(), x, y);
						y += UIConstants.Text.LINE_HEIGHT(f.getSize2D());
						lineBuilder = new StringBuilder();
					}
					// Add the word to the current line
					lineBuilder.append(word).append(" ");
				}
				// Draw the last line
				g.drawString(lineBuilder.toString(), x, y);
				y += UIConstants.Text.LINE_HEIGHT(f.getSize2D());
			}
		}
	}
	
}
