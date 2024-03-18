package helper;
import main.Game;

public class UIConstants {
	public static class Buttons {
		public static int X_OFFSETS = (int)(10 * Game.WIDTH_SCALE);
		public static int Y_OFFSETS = (int)(10 * Game.HEIGHT_SCALE);
		
		public static int final SETTINGS_WIDTH_DEFAULT = 48;
		public static int final SETTINGS_HEIGHT_DEFAULT = 48;
		public static int SETTINGS_WIDTH = (int) (SETTINGS_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int SETTINGS_HEIGHT = (int) (SETTINGS_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static int final INVENTORY_WIDTH_DEFAULT = 96;
		public static int final INVENTORY_HEIGHT_DEFAULT = 32;
		public static int INVENTORY_WIDTH = (int) (INVENTORY_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int INVENTORY_HEIGHT = (int) (INVENTORY_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static int final MAP_WIDTH_DEFAULT = 24;
		public static int final MAP_HEIGHT_DEFAULT = 32;
		public static int MAP_WIDTH = (int) (MAP_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int MAP_HEIGHT = (int) (MAP_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static int final CHOICE_WIDTH_DEFAULT = 350;
		public static int final CHOICE_HEIGHT_DEFAULT = 100;
		public static int CHOICE_WIDTH = (int) (CHOICE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int CHOICE_HEIGHT = (int) (CHOICE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
	}
	
	public static class RoomImage {
		public static int final DEFAULT_WIDTH = 700;
		public static int final DEFAULT_HEIGHT = 200;
		public static int SCALED_WIDTH = (int)(DEFAULT_WIDTH * Game.WIDTH_SCALE);
		public static int SCALED_HEIGHT = (int)(DEFAULT_HEIGHT * Game.HEIGHT_SCALE);
	}
	
	public static class Text {
		public static int final DEFAULT_LINE_HEIGTH = 15;
		public static int LINE_HEIGTH = (int)(DEFAULT_LINE_HEIGTH * Game.HEIGHT_SCALE);
	}
	
	public static class VolumeButtons {
		public static int final VOLUME_DEFAULT_WIDTH = 28;
		public static int final VOLUME_DEFAULT_HEIGHT = 44;
		public static int final SLIDER_DEFAULT_WIDTH = 215;
		
		public static int VOLUME_WIDTH = (int) (VOLUME_DEFAULT_WIDTH * Game.WIDTH_SCALE);
		public static int VOLUME_HEIGHT = (int) (VOLUME_DEFAULT_HEIGHT * Game.HEIGHT_SCALE);
		public static int SLIDER_WIDTH = (int) (SLIDER_DEFAULT_WIDTH * Game.WIDTH_SCALE);
	}
}
