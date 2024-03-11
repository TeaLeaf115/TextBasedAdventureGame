package data;

import java.util.Random;

public class Seed {
	public static long seed;
	public Seed() {
		Random rand = new Random();
		seed = rand.nextLong();
	}
	
	public static void setSeed(long newSeed) {
		seed = newSeed;
	}
	
	public static int randInt() {
		return new Random(seed).nextInt();
	}
	
	public static int randInt(int upperBounds) {
		return new Random(seed).nextInt(upperBounds);
	}
}
