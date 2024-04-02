package gameStates;

public enum Difficulty {
	NORMAL(20),
	HARD(15);
	
	public static Difficulty currDiff = NORMAL;
	
	public int numGuesses;
	Difficulty(int numGuesses) {
		this.numGuesses = numGuesses;
	}
	
	public static void setDifficulty(String s) {
		if (s.equals("0"))
			currDiff = NORMAL;
		else
			currDiff = HARD;
	}
}
