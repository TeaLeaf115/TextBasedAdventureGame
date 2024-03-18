package main;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	public GameWindow(GamePanel gamePanel) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(gamePanel);
		this.setLocationRelativeTo(null);
//		this.setResizable(false);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.pack();
		this.setVisible(true);
	}
}
