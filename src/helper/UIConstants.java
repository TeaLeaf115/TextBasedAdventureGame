package helper;
import main.Game;

public class UIConstants {
	public static class Buttons {
		public static final int B_WIDTH_DEFAULT = 48;
		public static final int B_HEIGHT_DEFAULT = 48;
		public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * Game.SCALE);
		public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * Game.SCALE);
	}
	
	public static class PauseButtons {
		public static final int SOUND_SIZE_DEFAULT = 42;
		public static final int SOUND_SIZE = (int) (SOUND_SIZE_DEFAULT * Game.SCALE);
	}
	
	public static class URMButtons {
		public static final int URM_DEFAULT_SIZE = 56;
		public static final int URM_SIZE = (int) (URM_DEFAULT_SIZE * Game.SCALE);
		
	}
	
	public static class VolumeButtons {
		public static final int VOLUME_DEFAULT_WIDTH = 28;
		public static final int VOLUME_DEFAULT_HEIGHT = 44;
		public static final int SLIDER_DEFAULT_WIDTH = 215;
		
		public static final int VOLUME_WIDTH = (int) (VOLUME_DEFAULT_WIDTH * Game.SCALE);
		public static final int VOLUME_HEIGHT = (int) (VOLUME_DEFAULT_HEIGHT * Game.SCALE);
		public static final int SLIDER_WIDTH = (int) (SLIDER_DEFAULT_WIDTH * Game.SCALE);
	}
}
