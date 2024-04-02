package helper;
import main.Game;
import main.GamePanel;

public class UIConstants {
	public static class Menu {
		public static final int TITLE_WIDTH_DEFAULT = 288;
		public static final int TITLE_HEIGHT_DEFAULT = 100;
		public static int TITLE_WIDTH = (int)(TITLE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
		public static int TITLE_HEIGHT = (int)(TITLE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		public static int TITLE_X = (int)(GamePanel.SCREEN_WIDTH/2 - TITLE_WIDTH/2);
		public static int TITLE_Y = (int)(GamePanel.SCREEN_WIDTH/6 - TITLE_HEIGHT/2);
	}
	
	public static class Buttons {
		public static int X_OFFSETS = (int)(10 * Game.WIDTH_SCALE);
		public static int Y_OFFSETS = (int)(10 * Game.HEIGHT_SCALE);
		
		public static class PlayState {
			public static final int SETTINGS_WIDTH_DEFAULT = 48;
			public static final int SETTINGS_HEIGHT_DEFAULT = 48;
			public static int SETTINGS_WIDTH = (int) (SETTINGS_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int SETTINGS_HEIGHT = (int) (SETTINGS_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int INVENTORY_WIDTH_DEFAULT = 96;
			public static final int INVENTORY_HEIGHT_DEFAULT = 32;
			public static int INVENTORY_WIDTH = (int) (INVENTORY_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int INVENTORY_HEIGHT = (int) (INVENTORY_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int MAP_WIDTH_DEFAULT = 24;
			public static final int MAP_HEIGHT_DEFAULT = 32;
			public static int MAP_WIDTH = (int) (MAP_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int MAP_HEIGHT = (int) (MAP_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int CHOICE_WIDTH_DEFAULT = 350;
			public static final int CHOICE_HEIGHT_DEFAULT = 75;
			public static int CHOICE_WIDTH = (int) (CHOICE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int CHOICE_HEIGHT = (int) (CHOICE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int CLUES_WIDTH_DEFAULT = 96;
			public static final int CLUES_HEIGHT_DEFAULT = 32;
			public static int CLUES_MENU_WIDTH = (int) (CLUES_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int CLUES_MENU_HEIGHT = (int) (CLUES_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		}
		
		public static class MenuStates {
			public static final int SAVE_AND_QUIT_WIDTH_DEFAULT = 128;
			public static final int SAVE_AND_QUIT_HEIGHT_DEFAULT = 32;
			public static int SAVE_AND_QUIT_WIDTH = (int) (SAVE_AND_QUIT_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int SAVE_AND_QUIT_HEIGHT = (int) (SAVE_AND_QUIT_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int CREDITS_WIDTH_DEFAULT = 128;
			public static final int CREDITS_HEIGHT_DEFAULT = 32;
			public static int CREDITS_WIDTH = (int) (CREDITS_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int CREDITS_HEIGHT = (int) (CREDITS_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int LOAD_GAME_WIDTH_DEFAULT = 128;
			public static final int LOAD_GAME_HEIGHT_DEFAULT = 32;
			public static int LOAD_GAME_WIDTH = (int) (LOAD_GAME_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int LOAD_GAME_HEIGHT = (int) (LOAD_GAME_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int NEW_GAME_WIDTH_DEFAULT = 128;
			public static final int NEW_GAME_HEIGHT_DEFAULT = 32;
			public static int NEW_GAME_WIDTH = (int) (NEW_GAME_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int NEW_GAME_HEIGHT = (int) (NEW_GAME_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int BACK_WIDTH_DEFAULT = 128;
			public static final int BACK_HEIGHT_DEFAULT = 32;
			public static int BACK_WIDTH = (int) (BACK_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int BACK_HEIGHT = (int) (BACK_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int CONTINUE_WIDTH_DEFAULT = 128;
			public static final int CONTINUE_HEIGHT_DEFAULT = 32;
			public static int CONTINUE_WIDTH = (int) (CONTINUE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int CONTINUE_HEIGHT = (int) (CONTINUE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
			
			public static final int CLUE_WIDTH_DEFAULT = 350;
			public static final int CLUE_HEIGHT_DEFAULT = 70;
			public static int CLUE_WIDTH = (int) (CLUE_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int CLUE_HEIGHT = (int) (CLUE_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		}
		
		public static class DiffSelector{
			public static final int DIFF_WIDTH_DEFAULT = 320;
			public static final int DIFF_HEIGHT_DEFAULT = 80;
			public static int DIFF_WIDTH = (int) (DIFF_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int DIFF_HEIGHT = (int) (DIFF_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		}
		
		public static class GuessButtons {
			public static final int GUESS_WIDTH_DEFAULT = 144;
			public static final int GUESS_HEIGHT_DEFAULT = 32;
			public static int GUESS_WIDTH = (int) (GUESS_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int GUESS_HEIGHT = (int) (GUESS_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		}
		
		public static class GameOverButton {
			public static final int GAME_OVER_WIDTH_DEFAULT = 320;
			public static final int GAME_OVER_HEIGHT_DEFAULT = 80;
			public static int GAME_OVER_WIDTH = (int) (GAME_OVER_WIDTH_DEFAULT * Game.WIDTH_SCALE);
			public static int GAME_OVER_HEIGHT = (int) (GAME_OVER_HEIGHT_DEFAULT * Game.HEIGHT_SCALE);
		}
	}
	
	public static class ClueUI {
		public static final int DEFAULT_WIDTH = 350;
		public static final int DEFAULT_HEIGHT = 400;
		public static int SCALED_WIDTH = (int)(DEFAULT_WIDTH * Game.WIDTH_SCALE);
		public static int SCALED_HEIGHT = (int)(DEFAULT_HEIGHT * Game.HEIGHT_SCALE);
	}
	
	public static class RoomImage {
		public static final int DEFAULT_WIDTH = 700;
		public static final int DEFAULT_HEIGHT = 200;
		public static int SCALED_WIDTH = (int)(DEFAULT_WIDTH * Game.WIDTH_SCALE);
		public static int SCALED_HEIGHT = (int)(DEFAULT_HEIGHT * Game.HEIGHT_SCALE);
	}
	
	public static class EndGameImages {
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
		public static float CREDITS_PX = 12f;
		public static float NEW_GAME_PX = 16f;
		public static float DIFF_PX = 24f;
		public static float CLUE_PX = 24f;
		
		public static int CREDITS_TEXT_X = Buttons.X_OFFSETS * 4;
		public static int CREDITS_TEXT_Y = Buttons.Y_OFFSETS * 3;
		public static int CREDITS_TEXT_WIDTH = GamePanel.SCREEN_WIDTH - CREDITS_TEXT_X;
		
		public static int NEW_GAME_TEXT_X = Buttons.X_OFFSETS * 4;
		public static int NEW_GAME_TEXT_Y = Buttons.Y_OFFSETS * 6;
		
		public static int DIFF_TEXT_X = GamePanel.SCREEN_WIDTH/6;
		public static int DIFF_TEXT_Y = Buttons.Y_OFFSETS * 6;
		public static int DIFF_TEXT_WIDTH = GamePanel.SCREEN_WIDTH - CREDITS_TEXT_X;
		
		public static int CLUE_TEXT_X = 235;
		public static int CLUE_TEXT_Y = 90;
		public static int CLUE_TEXT_WIDTH = 240;
		
		public static int CLUE_BUTTON_TEXT_X = 400;
		public static int CLUE_BUTTON_TEXT_Y = 90;
		public static int CLUE_BUTTON_TEXT_WIDTH = 330;
		
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
