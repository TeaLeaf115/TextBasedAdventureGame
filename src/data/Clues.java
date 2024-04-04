package data;

import java.util.ArrayList;
import java.util.Stack;

import static data.ClueList.*;
import static gameStates.Difficulty.currDiff;

public class Clues {
	public static Stack<Clues> cluesFound = new Stack<>();
	public static ArrayList<Clues> clueList = new ArrayList<>();
	
	private final String desc;
	private final String leadsTo;
	
	public Clues(String desc, String leadsTo) {
		this.desc = desc;
		this.leadsTo = leadsTo;
	}
	public Clues(String regex) {
		int separator = regex.indexOf('|');
		desc = regex.substring(0, separator);
		leadsTo = regex.substring(separator + 1);
	}
	
	public static void addClue(String foundIn, String leadsTo) {
		if (leadsTo.equals("End Game")) {
			clueList.add(new Clues("End Game", null));
			return;
		}
		clueList.add(new Clues(switch (currDiff) {
			case NORMAL -> NORMAL_CLUE_LIST.get(foundIn).get(leadsTo);
			case HARD -> HARD_CLUE_LIST.get(foundIn).get(leadsTo);
		}, leadsTo));
	}
	
	public static void initClues() {
		String[] clues = new String[6];
		switch (currDiff) {
			case NORMAL -> {
				clues[0] = "Initial Clue";
				clues[1] = getRandomKey(NORMAL_CLUE_LIST.get(clues[0]));
				clues[2] = getRandomKey(NORMAL_CLUE_LIST.get(clues[1]), 0, 4);
				clues[3] = getRandomKey(NORMAL_CLUE_LIST.get(clues[2]), 4, 9);
				clues[4] = getRandomKey(NORMAL_CLUE_LIST.get(clues[3]));
				clues[5] = "End Game";
				for (int i = 0; i < 5; i++)
					addClue(clues[i], clues[i+1]);
			}
			case HARD -> {
				clues[0] = "Initial Clue";
				clues[1] = getRandomKey(HARD_CLUE_LIST.get(clues[0]));
				clues[2] = getRandomKey(HARD_CLUE_LIST.get(clues[1]), 0, 4);
				clues[3] = getRandomKey(HARD_CLUE_LIST.get(clues[2]), 4, 9);
				clues[4] = getRandomKey(HARD_CLUE_LIST.get(clues[3]));
				clues[5] = "End Game";
				for (int i = 0; i < 5; i++)
					addClue(clues[i], clues[i+1]);
			}
		}
		System.out.println(clueList);
	}
	
	public static void findClue() {
		cluesFound.push(clueList.remove(0));
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getNext() {
		return leadsTo;
	}
	
	public static void clrClues() {
		cluesFound.clear();
		clueList.clear();
	}
	
	@Override
	public String toString() {
		return desc;//.replaceAll("\n", "\\\\\\\\") + "|" + leadsTo;
	}
}
