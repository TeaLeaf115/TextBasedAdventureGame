package data;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClueList {
	public static final LinkedHashMap<String, Map<String, String>> NORMAL_CLUE_LIST = new LinkedHashMap<>();
	
	static {
		Map<String, String> initialClueMap = new LinkedHashMap<>();
		initialClueMap.put("Foyer", "Head to the place where you can find the stairs to greatness");
		initialClueMap.put("Back Grounds", "Head to the place that is close to the marsh");
		initialClueMap.put("Bedroom #3", "Head to the place where it is so good, you can fall into a coma for three days");
		initialClueMap.put("Pool", "Head to The Marsh");
		initialClueMap.put("3rd Floor Study", "Head to the best private wet bar ever.");
		NORMAL_CLUE_LIST.put("Initial Clue", initialClueMap);
		
		Map<String, String> foyerMap = new LinkedHashMap<>();
		foyerMap.put("Back Grounds", "Flower Beds");
		foyerMap.put("Bedroom #3", "Soveværelse");
		foyerMap.put("Pool", "I heard they had a splashing good time");
		foyerMap.put("3rd Floor Study", "So many stairs *sigh*");
		foyerMap.put("Prison/Holding Cell", "Lock me up officer");
		foyerMap.put("Garage", "Beep Beep");
		foyerMap.put("Entrance/Fountain", "Step Outside");
		foyerMap.put("Dining Room", "Das essen");
		foyerMap.put("Disposal Room", "Why are there so many stairs, we need to kill one off");
		NORMAL_CLUE_LIST.put("Foyer", foyerMap);
		
		Map<String, String> backGroundsMap = new LinkedHashMap<>();
		backGroundsMap.put("Foyer", "One stair, two stair, all the stairs");
		backGroundsMap.put("Bedroom #3", "There are soggy footprints going to the Master Bedroom");
		backGroundsMap.put("Pool", "Close you are, South you need to go");
		backGroundsMap.put("3rd Floor Study", "What's that up there");
		backGroundsMap.put("Prison/Holding Cell", "The BAR exam was hard, well that's what I heard");
		backGroundsMap.put("Garage", "Look at that nice looking Golf Cart, wonder where they keep it");
		backGroundsMap.put("Entrance/Fountain", "Up your front and around the corner");
		backGroundsMap.put("Dining Room", "I’m always on the dinner table, but you don’t get to eat me. What am I?");
		backGroundsMap.put("Disposal Room", "It actually smells like rotting animal");
		NORMAL_CLUE_LIST.put("Back Grounds", backGroundsMap);
		
		Map<String, String> bedroom3Map = new LinkedHashMap<>();
		bedroom3Map.put("Foyer", "Nice central place");
		bedroom3Map.put("Back Grounds", "Not Front but...");
		bedroom3Map.put("Pool", "I am pretty wet now");
		bedroom3Map.put("3rd Floor Study", "Looking out the window you can almost make out an office in another window");
		bedroom3Map.put("Prison/Holding Cell", "Another place to be locked up in");
		bedroom3Map.put("Garage", "You think back to your car bed you had when you were 4");
		bedroom3Map.put("Entrance/Fountain", "Out, Right, Down, Out");
		bedroom3Map.put("Dining Room", "Another place you can eat");
		bedroom3Map.put("Disposal Room", "You smell a large nuke of a fart in the room, it's like something died in here");
		NORMAL_CLUE_LIST.put("Bedroom #3", bedroom3Map);
		
		Map<String, String> poolMap = new LinkedHashMap<>();
		poolMap.put("Foyer", "The way from the first steps into the house... Unless you broke in somewhere else");
		poolMap.put("Back Grounds", "\uD83C\uDFB5 Into the woods to grandmothers house \uD83C\uDFB5");
		poolMap.put("Bedroom #3", "lumi moe");
		poolMap.put("3rd Floor Study", "The place to lock yourself away and work");
		poolMap.put("Prison/Holding Cell", "The grates remind you of a place your cousin went once");
		poolMap.put("Garage", "I am speed");
		poolMap.put("Entrance/Fountain", "Fontana d'ingresso");
		poolMap.put("Dining Room", "No eating and swimming allowed");
		poolMap.put("Disposal Room", "You see a dead rat floating in the pool");
		NORMAL_CLUE_LIST.put("Pool", poolMap);
		
		Map<String, String> studyMap = new LinkedHashMap<>();
		studyMap.put("Foyer", "(Back to the window) Wow, what a nice bookshelf, I wonder what is on the other side...");
		studyMap.put("Back Grounds", "A nice view from the window, and then some");
		studyMap.put("Bedroom #3", """
				"I come upon you in the night
				You can resist with a fight
				But when I eventually win
				We take flight\"""");
		studyMap.put("Pool", "A nice view from the window, especially below");
		studyMap.put("Prison/Holding Cell", "A nice view from the window, especially below");
		studyMap.put("Garage", "You want to go so fast down these stairs");
		studyMap.put("Entrance/Fountain", "From the top make it drop");
		studyMap.put("Dining Room", "So viele Treppen zum Essen ");
		studyMap.put("Disposal Room", "There is a picture of a zombie the owner drew when he was younger on the desk.");
		NORMAL_CLUE_LIST.put("3rd Floor Study", studyMap);
		
		Map<String, String> prisonMap = new LinkedHashMap<>();
		prisonMap.put("Garage", """
				
				
				FAHREN!!!
				FAHREN!!!
				FAHREN!!!""");
		prisonMap.put("Entrance/Fountain", "Get to the start");
		prisonMap.put("Dining Room", "Nothing can beat school food. Wait... Prison food can. Never mind");
		prisonMap.put("Disposal Room", "Where they go when they're finished");
		NORMAL_CLUE_LIST.put("Prison/Holding Cell", prisonMap);
		
		Map<String, String> garageMap = new LinkedHashMap<>();
		garageMap.put("Prison/Holding Cell", "Make sure to LOCK the car next time");
		garageMap.put("Entrance/Fountain", "Where you got out of your car");
		garageMap.put("Dining Room", "You go the driving munchies");
		garageMap.put("Disposal Room", "Something from one of the cars smells funny.");
		NORMAL_CLUE_LIST.put("Garage", garageMap);
		
		Map<String, String> entryFountainMap = new LinkedHashMap<>();
		entryFountainMap.put("Prison/Holding Cell", "Stepping inside seems like a crime");
		entryFountainMap.put("Garage", "VROOOOM");
		entryFountainMap.put("Dining Room", "Time for Dinner!");
		entryFountainMap.put("Disposal Room", "Smells like rotting animal, no wait, it's you.");
		NORMAL_CLUE_LIST.put("Entrance/Fountain", entryFountainMap);
		
		Map<String, String> diningHallMap = new LinkedHashMap<>();
		diningHallMap.put("Prison/Holding Cell", "the prongs of your fork look like a cell");
		diningHallMap.put("Garage", "The plates look like steering wheels");
		diningHallMap.put("Entrance/Fountain", "Pizza's here");
		diningHallMap.put("Disposal Room", "Cannibalism");
		NORMAL_CLUE_LIST.put("Dining Room", diningHallMap);
		
		Map<String, String> disposalRoomMap = new LinkedHashMap<>();
		disposalRoomMap.put("Prison/Holding Cell", "Where they were before here");
		disposalRoomMap.put("Garage", "I wonder if they had nice looking cars");
		disposalRoomMap.put("Entrance/Fountain", "From the end to the start");
		disposalRoomMap.put("Dining Room", "Cannibalism");
		NORMAL_CLUE_LIST.put("Disposal Room", disposalRoomMap);
	}
	
	public static final LinkedHashMap<String, Map<String, String>> HARD_CLUE_LIST = new LinkedHashMap<>();
	
	static {
		Map<String, String> initialClueMap = new LinkedHashMap<>();
		initialClueMap.put("Foyer", "Head to the place where you can find the stairs to greatness");
		initialClueMap.put("Prison/Holding Cell", "Head to the place where can find the free bird and the ___ bird");
		initialClueMap.put("Bedroom #3", "Head to the place where it is so good, you can fall into a coma for three days");
		initialClueMap.put("Disposal Room", "Head to the place where the imprisoned go to their final rest");
		initialClueMap.put("Dungeon Study", "Head to the place that is secluded and studious");
		HARD_CLUE_LIST.put("Initial Clue", initialClueMap);
		
		Map<String, String> foyerMap = new LinkedHashMap<>();
		foyerMap.put("Prison/Holding Cell", "From the greats to the gates");
		foyerMap.put("Bedroom #3", "Up, Right Through Left");
		foyerMap.put("Disposal Room", "You entered your coffin when you accepted the invitation");
		foyerMap.put("Dungeon Study", "Geh, lernen, studieren!");
		foyerMap.put("Bedroom #5", "Fünfling Zimmer");
		foyerMap.put("Garage", "Beep Beep");
		foyerMap.put("Laboratory", "It has a big why in it...");
		foyerMap.put("Dining Room", "Das essen");
		foyerMap.put("Family Room", "Where the family of 5 entered the house before leaving to a farm up north...");
		HARD_CLUE_LIST.put("Foyer", foyerMap);
		
		Map<String, String> prisonMap = new LinkedHashMap<>();
		prisonMap.put("Foyer", "From gates to greats");
		prisonMap.put("Bedroom #3", "You and your three friends are having a sleepover");
		prisonMap.put("Disposal Room", "Fly Icarus, fly so high you fall down and meet your maker");
		prisonMap.put("Dungeon Study", "Where you'll be written about");
		prisonMap.put("Bedroom #5", "Upgraded Bedroom");
		prisonMap.put("Garage", "Cells to cars");
		prisonMap.put("Laboratory", "A good place to run some tests");
		prisonMap.put("Dining Room", "Nothing can beat school food. Wait... Prison food can. Never mind");
		prisonMap.put("Family Room", "Someone went here after sending a family of 5 to a farm up north...");
		HARD_CLUE_LIST.put("Prison/Holding Cell", prisonMap);
		
		Map<String, String> bedroom3Map = new LinkedHashMap<>();
		bedroom3Map.put("Foyer", "Nice central place");
		bedroom3Map.put("Prison/Holding Cell", "It also has a bed, not as nice, but it is a place you can sleep");
		bedroom3Map.put("Disposal Room", "A forever nights rest");
		bedroom3Map.put("Dungeon Study", "I Don't Need Sleep I Need Answers - Sheldor The Conqueror");
		bedroom3Map.put("Bedroom #5", """
				"00110011 00100000\s
				00101011 00100000\s
				00110010 00100000\s
				00111101 00100000\s
				00111111\"""");
		bedroom3Map.put("Garage", "You think back to your car bed you had when you were 4");
		bedroom3Map.put("Laboratory", "It has 3 chairs s-I mean people can lay on...");
		bedroom3Map.put("Dining Room", "Another place you can eat");
		bedroom3Map.put("Family Room", "The three children from a family of five laid their heads here before going to a farm up north...");
		HARD_CLUE_LIST.put("Bedroom #3", bedroom3Map);
		
		Map<String, String> disposalRoomMap = new LinkedHashMap<>();
		disposalRoomMap.put("Foyer", "You'll definitely need a new pair of legs after this");
		disposalRoomMap.put("Prison/Holding Cell", "Where some came from");
		disposalRoomMap.put("Bedroom #3", "A place for a different kind of temporary rest");
		disposalRoomMap.put("Dungeon Study", "Where you study these people");
		disposalRoomMap.put("Bedroom #5", "You can fit 5 bodies in this room3");
		disposalRoomMap.put("Garage", "I wonder if they had nice looking cars");
		disposalRoomMap.put("Laboratory", "Where they come from");
		disposalRoomMap.put("Dining Room", "Cannibalism");
		disposalRoomMap.put("Family Room", "The farm up north...");
		HARD_CLUE_LIST.put("Disposal Room", disposalRoomMap);
		
		Map<String, String> dungeonStudyMap = new LinkedHashMap<>();
		dungeonStudyMap.put("Foyer", "scOut, Threw Up");
		dungeonStudyMap.put("Prison/Holding Cell", "A good place to keep study subjects");
		dungeonStudyMap.put("Bedroom #3", "Start counting sheep");
		dungeonStudyMap.put("Disposal Room", "Where you can put your failed/terminated subjects");
		dungeonStudyMap.put("Bedroom #5", "Cinco");
		dungeonStudyMap.put("Garage", "The owner is a big fan of these things that go");
		dungeonStudyMap.put("Laboratory", "Where you get the stuff to study about comes from.");
		dungeonStudyMap.put("Dining Room", "One spaghetti noodle is called a spaghetto. Eat it here.");
		dungeonStudyMap.put("Family Room", "Where a family of 5 went to learn about the dark arts before going to a farm up north...");
		HARD_CLUE_LIST.put("Dungeon Study", dungeonStudyMap);
		
		Map<String, String> bedroom5Map = new LinkedHashMap<>();
		bedroom5Map.put("Garage", "Can't even fit enough cars for a family of 5. So they headed to a farm up north...");
		bedroom5Map.put("Laboratory", "A family of 5 visited get get results before heading to a farm up north...");
		bedroom5Map.put("Dining Room", "sum of two consecutive prime numbers");
		bedroom5Map.put("Family Room", "This could comfortable hold a family of five until they went to a farm up north...");
		HARD_CLUE_LIST.put("Bedroom #5", bedroom5Map);
		
		Map<String, String> garageMap = new LinkedHashMap<>();
		garageMap.put("Bedroom #5", "If you could only fit one more car in this 4 car garage");
		garageMap.put("Laboratory", "Lanthanum + Boron");
		garageMap.put("Dining Room", "You go the driving munchies");
		garageMap.put("Family Room", "This couldn't hold all the cars for the family of five before they went to a farm up north...");
		HARD_CLUE_LIST.put("Garage", garageMap);
		
		Map<String, String> laboratoryMap = new LinkedHashMap<>();
		laboratoryMap.put("Bedroom #5", "Big Cell 5");
		laboratoryMap.put("Garage", "UNLIMITED {Horse} POWER");
		laboratoryMap.put("Dining Room", "Quit playing with your food!");
		laboratoryMap.put("Family Room", "A family of 5 went here to get some results back before heading to a farm up north...");
		HARD_CLUE_LIST.put("Laboratory", laboratoryMap);
		
		Map<String, String> diningHallMap = new LinkedHashMap<>();
		diningHallMap.put("Bedroom #5", "Really only 5 seats?");
		diningHallMap.put("Garage", "The plates look like steering wheels");
		diningHallMap.put("Laboratory", "Go ahead and play with your food");
		diningHallMap.put("Family Room", "Where a family of 5 goes to hang out, until they went to a farm up north...");
		HARD_CLUE_LIST.put("Dining Room", diningHallMap);
		
		Map<String, String> familyRoomMap = new LinkedHashMap<>();
		familyRoomMap.put("Bedroom #5", "A family of 5 used to live here, then they visited the farm up north...");
		familyRoomMap.put("Garage", "A family of 5 used to go here to head out to the farm up north...");
		familyRoomMap.put("Laboratory", "A family of 5 went here when they found out they needed to head to the farm up north...");
		familyRoomMap.put("Dining Room", "A family of 5 used to eat here, until they went to the farm up north...");
		HARD_CLUE_LIST.put("Family Room", familyRoomMap);
	}
	
	public static <K, V> K getRandomKey(Map<K, V> map, int lowerBounds, int upperBounds) {
		List<K> keys = new ArrayList<>(map.keySet());
		return keys.get(lowerBounds + Seed.randInt(upperBounds - lowerBounds));
	}
	
	public static <K, V> K getRandomKey(Map<K, V> map) {
		List<K> keys = new ArrayList<>(map.keySet());
		return keys.get(Seed.randInt(keys.size()));
	}
}