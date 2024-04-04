package gameStates;

public enum GameStates {
	STARTUP,
	MAIN_MENU,
	DIFF_SELECTION,
	PLAY,
	INVENTORY,
	MAP,
	CLUES,
	OPTIONS,
	CREDITS,
	NEW_GAME_BLURB,
	END_STATE,
	SAVE_AND_QUIT;
	
	public static GameStates state = STARTUP;
	public static GameStates prevState = MAIN_MENU;

	public static void applyStateChange(GameStates state) {
		GameStates.prevState = GameStates.state;
		GameStates.state = state;
		System.out.println("Previous GameState: " + GameStates.prevState);
		System.out.println("Current GameState: " + GameStates.state);
	}
}