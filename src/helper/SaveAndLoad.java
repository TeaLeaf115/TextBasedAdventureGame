package helper;

import data.Clues;
import gameStates.Difficulty;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static data.Clues.cluesFound;
import static data.Rooms.currRoomID;
import static data.Seed.seed;
import static data.Seed.setSeed;
import static gameStates.Difficulty.currDiff;

public class SaveAndLoad {
	/*
	* Things to save:
	* ----------------
	* Seed
	* Difficulty
	* Current Room
	* Clues Found
	*
	* */
	
	public static boolean loadedFromSave = false;
	
	public static void Save() {
		try {
			FileWriter fw = new FileWriter("src/save_data/save1.dat");
			fw.write(seed + "\n");
			fw.write(currDiff.ordinal() + "\n");
			fw.write(currRoomID + "\n");
			fw.write(cluesFound.size() + "\n");
			for (Clues cl : cluesFound) {
				fw.write(cl + "\n");
			}
			fw.close();
			System.out.println("Game saved to save1.dat");
		}
		catch (IOException e) {
			new File("src/save_data/save1.dat");
			Save();
		}
	}
	
	public static void Load() {
		try {
			File f = new File("src/save_data/save1.dat");
			Scanner inp = new Scanner(f);
			
			setSeed(Long.parseLong(inp.nextLine()));
			Difficulty.setDifficulty(inp.nextLine());
			currRoomID = inp.nextLine();
			int numCluesFound = Integer.parseInt(inp.nextLine());
			for (int i = 0; i < numCluesFound; i++)
				cluesFound.add(new Clues(inp.nextLine()));
			inp.close();
			
			loadedFromSave = true;
			System.out.println("Game loaded Save from save1.dat");
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
