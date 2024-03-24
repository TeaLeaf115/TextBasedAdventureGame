package gameStates;

import helper.ImageHandler;
import main.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MainMenu extends State implements GSInterface{
	public MainMenu(Game game) {
		super(game);
	}
	
	@Override
	public void update() {
	
	}
	
	@Override
	public void draw(Graphics g) {
//		g.drawImage(ImageHandler.getImage(ImageHandler.TITLE_LOGO), );
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
}
