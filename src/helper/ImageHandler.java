package helper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler {
	
	// Room Images
	public static final String PLACEHOLDER = "res/images/rooms/Placehold_RoomIcon.png";
	
	// UI Elements
	public static final String TOP_BUTTON_SS = "res/images/ui/TopButton_SS.png";
	public static final String PAUSE_BUTTON = "res/images/ui/PauseButton.png";
	public static final String SETTINGS_BUTTON = "res/images/ui/SettingsButton.png";
	public static final String CHOICE_BUTTON = "res/images/ui/ChoiceButton.png";
	
	public static BufferedImage getImage(String fileName) {
		try {
			return ImageIO.read(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
