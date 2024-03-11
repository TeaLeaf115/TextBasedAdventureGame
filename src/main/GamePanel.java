package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class GamePanel extends JPanel {
	public static int SCREEN_WIDTH = 700;
	public static int SCREEN_HEIGHT = 400;
	private MouseInputs mouseInputs;
	private Game game;
	
	public GamePanel(Game game) {
		mouseInputs = new MouseInputs();
		this.game = game;
		setPanelSize();
		addKeyListener(new KeyboardInputs());
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		this.setBackground(Color.BLACK);
	}
	
	private void setPanelSize() {
		Dimension size = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.setPreferredSize(size);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.render(g);
	}
	
	public void update() {
	}
}
