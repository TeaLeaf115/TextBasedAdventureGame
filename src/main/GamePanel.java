package main;

import helper.UIConstants;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GamePanel extends JPanel {
	public static int SCREEN_WIDTH = 700;
	public static int SCREEN_HEIGHT = 400;
	private MouseInputs mouseInputs;
	private Game game;
	private Font font;
	
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
			font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/prstart.ttf")).deriveFont(10f);
		} catch (IOException | FontFormatException e) {
			e.printStackTrace();
			// Handle font loading error
		}
	}
	
	private void setPanelSize() {
		Dimension size = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.setPreferredSize(size);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.setFont(font);
		game.render(g);
	}
	
	public void update() {
		SCREEN_WIDTH = getWidth();
	}
	
	public Game getGame() {
		return game;
	}
	
	public static void drawWrappedString(Graphics g, String text, int x, int y, int maxLineLength) {
		// Split the text into lines
		String[] lines = text.split("\n");
		for (String line : lines) {
			// Split the line into words
			String[] words = line.split("\\s+");
			StringBuilder lineBuilder = new StringBuilder();
			for (String word : words) {
				// Check if adding the current word exceeds the maximum width
				if (g.getFontMetrics().stringWidth(lineBuilder.toString() + " " + word) > maxLineLength) {
					// Draw the current line and reset line StringBuilder
					g.drawString(lineBuilder.toString(), x, y);
					y += UIConstants.Text.LINE_HEIGTH;
					lineBuilder = new StringBuilder();
				}
				// Add the word to the current line
				lineBuilder.append(word).append(" ");
			}
			// Draw the last line
			g.drawString(lineBuilder.toString(), x, y);
			y += UIConstants.Text.LINE_HEIGTH;
		}
	}
}
