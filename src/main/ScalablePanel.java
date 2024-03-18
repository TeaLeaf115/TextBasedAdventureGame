import gameStates.Play;
import main.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ScalablePanel extends JPanel {
	
	private double scaleFactor = 1.0;
	
	public ScalablePanel() {
		// Add a component listener to monitor changes in panel size
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				// When the panel is resized, calculate the new scale factor
				calculateScaleFactor();
				// Repaint the panel to reflect the changes
				repaint();
			}
		});
	}
	
	private void calculateScaleFactor() {
		// Get the new size of the panel
		Dimension size = getSize();
		// Calculate scale factor based on the new width and height relative to some base values
		scaleFactor = Math.min((double) size.width / baseWidth, (double) size.height / baseHeight);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Create a graphics2D object from the graphics object
		Graphics2D g2d = (Graphics2D) g.create();
		
		// Apply the scaling transformation
		g2d.scale(scaleFactor, scaleFactor);
		
		// Draw your content using the scaled graphics object
		g2d.draw3DRect(10, 10, 10, 10, false);
		// Don't forget to dispose the graphics object
		g2d.dispose();
	}
	
	// Define some base values for scaling calculation
	private int baseWidth = 800; // Example base width
	private int baseHeight = 600; // Example base height
	
	// Example content drawing method
	private void drawContent(Graphics2D g2d) {
	
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Scalable Panel");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			ScalablePanel panel = new ScalablePanel();
			frame.getContentPane().add(panel);
			frame.setSize(800, 600); // Set initial size
			
			frame.setVisible(true);
		});
	}
}
