package data;

import java.util.Random;

public class Seed {
	public static long seed;
	private static Random rand;
	public Seed() {
		Random rand = new Random();
		seed = rand.nextLong();
		Seed.rand = new Random(seed);
	}
	
	public static void setSeed(long newSeed) {
		seed = newSeed;
		rand = new Random(seed);
	}
	
	public static int randInt() {
		return rand.nextInt();
	}
	
	public static int randInt(int upperBounds) {
		return rand.nextInt(upperBounds);
	}
}
