package graphics.helper;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * The {@code SpriteSheetReader} class is responsible for reading a sprite sheet image file
 * and extracting sprites based on specified dimensions. It provides methods to convert the entire
 * sprite sheet into an array of individual sprites and retrieve a specific sprite from the sheet.
 *
 * <p>
 * Example Usage:
 * <pre>
 * {@code
 * SpriteSheetReader spriteSheetReader = new SpriteSheetReader("path/to/spritesheet.png", 16, 16);
 *
 * // Convert the entire sprite sheet into an array of sprites
 * BufferedImage[] spriteArray = spriteSheetReader.spriteSheetToArray();
 *
 * // Retrieve a specific sprite from the sprite sheet
 * BufferedImage singleSprite = spriteSheetReader.getSpriteFromSheet(0, 0, 16, 16);
 * }
 * </pre>
 * </p>
 *
 * @see BufferedImage
 * @see IOException
 */
public class SpriteSheetReader {
	
	// Buffered image to hold the sprite sheet.
	private BufferedImage spriteSheet;
	
	// The width and height of each sprite tile.
	private final int tileWidth;
	private final int tileHeight;
	
	// The number of rows and columns in the sprite sheet.
	private final int numRows;
	private final int numCols;
	
	/**
	 * Class constructor that reads the inputted file and specifies the width/height of each sprite.
	 *
	 * @param fileName   The image file path/name.
	 * @param tileWidth  The width of each sprite tile.
	 * @param tileHeight The height of each sprite tile.
	 */
	public SpriteSheetReader(String fileName, int tileWidth, int tileHeight) {
		// Creates a BufferedImage of the original image from 'fileName'.
		try {
			this.spriteSheet = ImageIO.read(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.tileWidth = tileWidth;
		this.tileHeight = tileHeight;
		
		this.numRows = spriteSheet.getHeight() / tileHeight;
		this.numCols = spriteSheet.getWidth() / tileWidth;
	}
	
	/**
	 * Turns a sprite sheet into an array of each sprite.
	 *
	 * @return BufferedImage[] array of each sprite from the sprite sheet going from left to right.
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @see BufferedImage
	 */
	public BufferedImage[] spriteSheetToArray() throws IOException {
		// Creates an array for the sprites from the sheet.
		BufferedImage[] spriteArray = new BufferedImage[numRows * numCols];
		
		// For loop that goes through every column and row in the sprite sheet and adds a sub-image square to an array.
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				spriteArray[(i * numCols) + j] = spriteSheet.getSubimage(j * tileWidth, i * tileHeight, tileWidth, tileHeight);
			}
		}
		
		// Returns the array of sprites.
		return spriteArray;
	}
	
	/**
	 * Returns a single sprite from the sprite sheet.
	 *
	 * @param row         The row that the sprite sheet will start grabbing the sprite from.
	 * @param col         The column that the sprite sheet will start grabbing the sprite from.
	 * @param spriteWidth The width of the sprite that will be returned.
	 * @param spriteHeight The height of the sprite that will be returned.
	 * @return BufferedImage of the sprite from the sprite sheet.
	 * @throws IndexOutOfBoundsException If the specified sprite is outside the boundaries of the sprite sheet.
	 */
	public BufferedImage getSpriteFromSheet(int row, int col, int spriteWidth, int spriteHeight) {
		// If statement that checks if the sprite that will try to be accessed is within the boundaries of the sprite sheet.
		if (row * tileWidth >= spriteSheet.getWidth() || col * tileHeight >= spriteSheet.getHeight() || row < 0 || col < 0)
			throw new IndexOutOfBoundsException("There was an issue with grabbing the sprite you wanted.");
		
		// Returns a sub-image from the sprite sheet.
		return spriteSheet.getSubimage(col * tileHeight, row * tileWidth, spriteWidth, spriteHeight);
	}
}