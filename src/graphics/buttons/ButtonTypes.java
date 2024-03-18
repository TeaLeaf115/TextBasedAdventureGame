package graphics.buttons;

import helper.ImageHandler;
import static helper.UIConstants.Buttons.*;

import java.awt.*;
import java.awt.image.BufferedImage;

public enum ButtonTypes {
	SETTINGS(SETTINGS_WIDTH,
			SETTINGS_HEIGHT,
			ImageHandler.getImage(ImageHandler.SETTINGS_BUTTON),
			new Rectangle(SETTINGS_WIDTH, SETTINGS_HEIGHT)),
	START,
	INVENTORY(INVENTORY_WIDTH,
			INVENTORY_HEIGHT,
			ImageHandler.getImage(ImageHandler.TOP_BUTTON_SS),
			new Rectangle(INVENTORY_WIDTH, INVENTORY_HEIGHT)),
	MAP(MAP_WIDTH,
			MAP_HEIGHT,
			ImageHandler.getImage(ImageHandler.TOP_BUTTON_SS),
			new Rectangle(MAP_WIDTH, MAP_HEIGHT)),
	CREDITS,
	OPTION,
	SOUND,
	SAVE_AND_EXIT,
	CHOICE(CHOICE_WIDTH,
			CHOICE_HEIGHT,
			ImageHandler.getImage(ImageHandler.CHOICE_BUTTON),
			new Rectangle(CHOICE_WIDTH, CHOICE_HEIGHT));
	
	public final int width, height;
	public final BufferedImage img;
	public final Rectangle bounds;
	ButtonTypes(int width, int height, BufferedImage img, Rectangle bounds) {
		this.width = width;
		this.height = height;
		this.img = img;
		this.bounds = bounds;
	}
	
	private ButtonTypes() {
		this.width = 10;
		this.height = 10;
		this.img = ImageHandler.getImage(ImageHandler.PAUSE_BUTTON);
		this.bounds = new Rectangle(width, height);
	}
}
