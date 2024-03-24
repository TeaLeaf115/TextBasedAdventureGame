package helper;
import main.Game;
import main.GamePanel;
import main.GameWindow;

public class UIConstants {
	public static class Menu {
		public static final int TITLE_WIDTH_DEFAULT = 288;
		public static final int TITLE_HEIGHT_DEFAULT = 100;
		public static int TITLE_WIDTH = (int)(TITLE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
	public static int TITLE_HEIGHT = (int)(TITLE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
	}
	
	public static class Buttons {
		public static int X_OFFSETS = (int)(10 * Game.WIDTH_SCALE);
		public static int Y_OFFSETS = (int)(10 * Game.HEIGHT_SCALE);
		
		public static final int SETTINGS_WIDTH_DEFAULT = 48;
		public static final int SETTINGS_HEIGHT_DEFAULT = 48;
		public static int SETTINGS_WIDTH = (int) (SETTINGS_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int SETTINGS_HEIGHT = (int) (SETTINGS_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static final int INVENTORY_WIDTH_DEFAULT = 96;
		public static final int INVENTORY_HEIGHT_DEFAULT = 32;
		public static int INVENTORY_WIDTH = (int)(INVENTORY_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int INVENTORY_HEIGHT = (int)(INVENTORY_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static final int MAP_WIDTH_DEFAULT = 24;
		public static final int MAP_HEIGHT_DEFAULT = 32;
		public static int MAP_WIDTH = (int)(MAP_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int MAP_HEIGHT = (int)(MAP_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		
		public static final int CHOICE_WIDTH_DEFAULT = 350;
		public static final int CHOICE_HEIGHT_DEFAULT = 75;
		public static int CHOICE_WIDTH = (int)(CHOICE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int CHOICE_HEIGHT = (int)(CHOICE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
	}
	
	public static class RoomImage {
		public static final int DEFAULT_WIDTH = 700;
		public static final int DEFAULT_HEIGHT = 200;
		public static int SCALED_WIDTH = (int)(DEFAULT_WIDTH * Game.WIDTH_SCALE);
		public static int SCALED_HEIGHT = (int)(DEFAULT_HEIGHT * Game.HEIGHT_SCALE);
	}
	
	public static class Text {
		public static final int DEFAULT_LINE_HEIGHT = 15;
		public static final float DEFAULT_PX = 12f;
		public static float CHOICE_PX = 24f;
		public static float DESCRIPTION_PX = 6f;
		
		public static int LINE_HEIGHT(float px) {
			return (int)((px + 5) * Game.HEIGHT_SCALE);
		}
	}
	
	public static class Description {
		public static final int DEFAULT_BOX_HEIGHT = 50;
		public static final int DEFAULT_BOX_WIDTH = GamePanel.SCREEN_WIDTH;
		public static int BOX_WIDTH = (int)(DEFAULT_BOX_WIDTH * Game.WIDTH_SCALE);
		public static int BOX_HEIGHT = (int)(DEFAULT_BOX_HEIGHT * Game.HEIGHT_SCALE);
	}
}
