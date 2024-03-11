package gameStates;

public enum GameStates {
	STARTUP,
	MAIN_MENU,
	PLAY,
	INVENTORY,
	MAP,
	OPTIONS,
	CREDITS,
	SAVE_AND_QUIT;
	
	public static GameStates state = PLAY;
}
