package helper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler {
	
	// Room Images
	public static final String PLACEHOLDER = "res/images/rooms/Placehold_RoomIcon.png";
	public static final String THIRD_FLOOR_STUDY = "res/images/rooms/3rd_Floor_Study.png";
	public static final String BACK_GROUNDS = "res/images/rooms/Back_Grounds.png";
	public static final String BASEMENT_STAIRS = "res/images/rooms/Basement_Stairs.png";
	public static final String BED_2 = "res/images/rooms/Bed2.png";
	public static final String BED_3 = "res/images/rooms/Bed3.png";
	public static final String BED_4 = "res/images/rooms/Bed4.png";
	public static final String BED_5 = "res/images/rooms/Bed5.png";
	public static final String BRIDGE = "res/images/rooms/Bridge.png";
	public static final String DINING_ROOM = "res/images/rooms/Dining_Room.png";
	public static final String DISPOSAL_ROOM = "res/images/rooms/Disposal_Room.png";
	public static final String DUNGEON_ENTRANCE = "res/images/rooms/Dungeon_Entrance.png";
	public static final String DUNGEON_STUDY = "res/images/rooms/Dungeon_Study.png";
	public static final String MANSION_ENTRANCE = "res/images/rooms/Entrance.png";
	public static final String FAMILY_ROOM = "res/images/rooms/Family_Room.png";
	public static final String FOYER = "res/images/rooms/Foyer.png";
	public static final String FRONT_GROUNDS = "res/images/rooms/Front_Grounds.png";
	public static final String GARAGE = "res/images/rooms/Garage.png";
	public static final String GREAT_ROOM = "res/images/rooms/Great_Room.png";
	public static final String HALLWAY_TO_DUNGEON = "res/images/rooms/Hallway_To_Dungeon.png";
	public static final String HALLWAY_TO_LRIGHTWING = "res/images/rooms/Hallway_To_RW.png";
	public static final String HALLWAY_TO_URIGHTWING = "res/images/rooms/Hallway_To_RWU.png";
	public static final String HOLDING_AREA = "res/images/rooms/Holding_Area.png";
	public static final String KITCHEN = "res/images/rooms/Kitchen.png";
	public static final String LAB = "res/images/rooms/Lab.png";
	public static final String LAMAI = "res/images/rooms/Lamai.png";
	public static final String LOFT = "res/images/rooms/Loft.png";
	public static final String MASTER_SUITE = "res/images/rooms/Master_Suite.png";
	public static final String MASTER_SUITE_BATHROOM = "res/images/rooms/Master_Suite_Bathroom.png";
	public static final String MUD_ROOM = "res/images/rooms/Mud_Room.png";
	public static final String POOL_AREA = "res/images/rooms/Pool_Area.png";
	public static final String SITTING_AREA = "res/images/rooms/Sitting_Area.png";
	public static final String STORAGE = "res/images/rooms/Storage.png";
	public static final String TEST_CELLS = "res/images/rooms/Test_Cells.png";
	public static final String UTILITY_ROOM = "res/images/rooms/Utility_Room.png";
	
	// UI Elements
	public static final String TOP_BUTTON_SS = "res/images/ui/buttons/TopButton_SS.png";
	public static final String PAUSE_BUTTON = "res/images/ui/buttons/PauseButton.png";
	public static final String SETTINGS_BUTTON = "res/images/ui/buttons/SettingsButton.png";
	public static final String CHOICE_BUTTON = "res/images/ui/buttons/ChoiceButton.png";
	public static final String TITLE_LOGO = "res/images/ui/Title.png";
	
	public static BufferedImage getImage(String fileName) {
		try {
			if (fileName.equals(DISPOSAL_ROOM))
				System.out.println(true);
			return ImageIO.read(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
