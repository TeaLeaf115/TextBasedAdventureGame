package main;

import helper.ImageHandler;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameWindow extends JFrame {
	public GameWindow(GamePanel gamePanel) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setName("Escapé");
		this.setIconImage(ImageHandler.getImage(ImageHandler.WINDOW_LOGO));
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.out.println("GAME NOT SAVED");
				System.out.println("Window Closed");
				System.exit(0);
			}
		});
		this.add(gamePanel);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
//		this.setExtendedState(MAXIMIZED_BOTH);
		this.pack();
		this.setVisible(true);
	}
}
