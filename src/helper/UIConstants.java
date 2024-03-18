package helper;
import main.Game;

public class UIConstants {
	public static class Buttons {
		public static final int X_OFFSETS = (int)(10 * Game.WIDTH_SCALE);
		public static final int Y_OFFSETS = (int)(10 * Game.HEIGHT_SCALE);
		
		public static final int SETTINGS_WIDTH_DEFAULT = 48;
		public static final int SETTINGS_HEIGHT_DEFAULT = 48;
		public static final int SETTINGS_WIDTH = (int) (SETTINGS_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static final int SETTINGS_HEIGHT = (int) (SETTINGS_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static final int INVENTORY_WIDTH_DEFAULT = 96;
		public static final int INVENTORY_HEIGHT_DEFAULT = 32;
		public static final int INVENTORY_WIDTH = (int) (INVENTORY_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static final int INVENTORY_HEIGHT = (int) (INVENTORY_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static final int MAP_WIDTH_DEFAULT = 24;
		public static final int MAP_HEIGHT_DEFAULT = 32;
		public static final int MAP_WIDTH = (int) (MAP_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static final int MAP_HEIGHT = (int) (MAP_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static final int CHOICE_WIDTH_DEFAULT = 350;
		public static final int CHOICE_HEIGHT_DEFAULT = 100;
		public static final int CHOICE_WIDTH = (int) (CHOICE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static final int CHOICE_HEIGHT = (int) (CHOICE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
	}
	
	public static class RoomImage {
		public static final int DEFAULT_WIDTH = 700;
		public static final int DEFAULT_HEIGHT = 200;
		public static int SCALED_WIDTH = (int)(DEFAULT_WIDTH * Game.WIDTH_SCALE);
		public static int SCALED_HEIGHT = (int)(DEFAULT_HEIGHT * Game.HEIGHT_SCALE);
	}
	
	public static class Text {
		public static final int DEFAULT_LINE_HEIGTH = 15;
//		public static final int LINE_WIDTH =
		public static final int LINE_HEIGTH = (int)(DEFAULT_LINE_HEIGTH * Game.HEIGHT_SCALE);
	}
	
	public static class VolumeButtons {
		public static final int VOLUME_DEFAULT_WIDTH = 28;
		public static final int VOLUME_DEFAULT_HEIGHT = 44;
		public static final int SLIDER_DEFAULT_WIDTH = 215;
		
		public static final int VOLUME_WIDTH = (int) (VOLUME_DEFAULT_WIDTH * Game.WIDTH_SCALE);
		public static final int VOLUME_HEIGHT = (int) (VOLUME_DEFAULT_HEIGHT * Game.HEIGHT_SCALE);
		public static final int SLIDER_WIDTH = (int) (SLIDER_DEFAULT_WIDTH * Game.WIDTH_SCALE);
	}
}
