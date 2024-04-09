package data;

import helper.ImageHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

import static helper.UIConstants.Buttons.X_OFFSETS;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Description.BOX_WIDTH;
import static helper.UIConstants.RoomImage.SCALED_HEIGHT;
import static helper.UIConstants.RoomImage.SCALED_WIDTH;
import static helper.UIConstants.Text.DESCRIPTION_PX;
import static main.GamePanel.font;

public class Rooms {
	public static String currRoomID = "Foyer";
	
	private String roomName = "";
	private String roomDesc = """
            """;
	private boolean isPOI;
	private BufferedImage roomImg;
	private Choice[] choices;
	public Rooms() {
		changeRoom(currRoomID);
	}
	
	public void changeRoom(String roomID) {
		currRoomID = roomID;
		switch (roomID) {
			case "Entrance/Fountain" -> {
				roomName = roomID;
				roomDesc = "The house is a nice pearl white color, with windows decorating the front. In front is a grand entrance for someone fitting that stature. A fountain in between an imperial staircase, with miniature spotlights leading to a grand front balcony.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.MANSION_ENTRANCE);
				choices = new Choice[] {
						new Choice("Go to Foyer", "Foyer"),
						new Choice("Go to Front Grounds", "Front Grounds"),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Foyer" -> {
				roomName = roomID;
				roomDesc = "A large circular room with an imperial staircase going up the side, with a gaudy chandelier cascading from the ceiling. In the middle there is a large planter full of exotic plants and a large flowering tree.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.FOYER);
				choices = new Choice[] {
						new Choice("Go to Entrance", "Entrance/Fountain"),
						new Choice("Go to Bridge (Upstairs)", "Bridge"),
						new Choice("Go to Sitting Area", "Sitting Area"),
						new Choice("Go to Right Wing Hall", "Hallway to Lower Right Wing"),
				};
			}
			case "Sitting Area" -> {
				roomName = roomID;
				roomDesc = "An entrance to the Master Suite, there is a few lamps, small tables and shelves holding an assortment of personal items. There is a door that leads to the backyard, and another to the Master Bathroom.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.SITTING_AREA);
				choices = new Choice[] {
						new Choice("To Foyer", "Foyer"),
						new Choice("To Master Suite", "Master Suite"),
						new Choice("To Pool", "Pool"),
						new Choice("To Master Bathroom", "Master Suite Bathroom"),
				};
			}
			case "Master Suite" -> {
				roomName = roomID;
				roomDesc = "A King size bed is pushed up to the back of the room. There are night stands on either side of the bed, and a big area rug covering almost all the room.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.MASTER_SUITE);
				choices = new Choice[] {
						new Choice("To Sitting Area", "Sitting Area"),
						new Choice("To Secret Passage", "Basement Stairs"),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Master Suite Bathroom" -> {
				roomName = roomID;
				roomDesc = "An expansive room with two walk-in closets, and a door leading to the backyard. As you walk in, there is a large, octagonal room that hosts two glass showers in the back, and a large bathtub in the center.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.MASTER_SUITE_BATHROOM);
				choices = new Choice[] {
						new Choice("To Sitting Area", "Sitting Area"),
						new Choice("To Pool", "Pool"),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Hallway to Lower Right Wing" -> {
				roomName = roomID;
				roomDesc = "It is a decently sized hallway decorated with blunt swords on the walls, and an area rug spanning across the entire hallway. This hallway leads to the foyer, the dinning room, the kitchen, and a stair case to the second floor.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.HALLWAY_TO_LRIGHTWING);
				choices = new Choice[] {
						new Choice("To Foyer", "Foyer"),
						new Choice("To Dining Room ", "Dining Room"),
						new Choice("To Kitchen", "Kitchen"),
						new Choice("To Loft", "Loft"),
				};
			}
			case "Kitchen" -> {
				roomName = roomID;
				roomDesc = "A decently sized kitchen with all the basics, knives, a stove, washing machines, prep area. Although it is not in the most ideal layout, it is functional nonetheless.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.KITCHEN);
				choices = new Choice[] {
						new Choice("To Lower Right Hallway", "Hallway to Lower Right Wing"),
						new Choice("To Family Room", "Family Room"),
						new Choice("To Mud Room", "Mud Room"),
						new Choice(""),
				};
			}
			case "Dining Room" -> {
				roomName = roomID;
				roomDesc = "A room with a large walnut table with around twelve seats total, there are a few fine china cabinets along the wall, and a chandelier in the middle of the room. Just outside the dinning room is one of the main hallways.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.DINING_ROOM);
				choices = new Choice[] {
						new Choice("To Lower Right Hallway", "Hallway to Lower Right Wing"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Family Room" -> {
				roomName = roomID;
				roomDesc = "An large luxurious room with an exotic area rug with a lovesac on top. In from of the couch, there is a 102\" Tv above a marble hearth fireplace. There are doors leading to the pool. Inside you can get to the kitchen.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.FAMILY_ROOM);
				choices = new Choice[] {
						new Choice("To Kitchen", "Kitchen"),
						new Choice("To Pool", "Pool"),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Garage" -> {
				roomName = roomID;
				roomDesc = "This is a decently sized 4 car garage. Currently there is a Lamborghini and Porsche 911, one of the car spots is occupied by different woodworking and machinery.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.GARAGE);
				choices = new Choice[] {
						new Choice("To Mud Room", "Mud Room"),
						new Choice("To Front Grounds", "Front Grounds"),
						new Choice("To Back Grounds", "Back Grounds"),
						new Choice(""),
				};
			}
			case "Mud Room" -> {
				roomName = roomID;
				roomDesc = "The room is nearly spotless, it has a small closet for storing coats and umbrellas, with two small benches with some shoe storage underneath on both sides of the closet. The room is seldom used due to its cleanliness, and lack of shoes in the shoe storage.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.MUD_ROOM);
				choices = new Choice[] {
						new Choice("To Kitchen", "Kitchen"),
						new Choice("To Garage", "Garage"),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Pool" -> {
				roomName = roomID;
				roomDesc = "There is a pretty large pool with only curves and no hard corners. It looks like it goes to 10ft deep. Over one of the sections there is a bridge to get from the Family Room entrance to the Master Suite entrances.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.POOL_AREA);
				choices = new Choice[] {
						new Choice("To Sitting Area", "Sitting Area"),
						new Choice("To Master Bathroom", "Master Bathroom"),
						new Choice("To Back Grounds", "Back Grounds"),
						new Choice("To Family Room", "Family Room"),
				};
			}
			case "Back Grounds" -> {
				roomName = roomID;
				roomDesc = "It is a nice quaint section of the grounds, there is a small garden with fresh vegetables, and a few flower beds growing blue orchids. There is a small maze but it seems to be blocked off. You are able to get to the front of the house by going around the side.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.BACK_GROUNDS);
				choices = new Choice[] {
						new Choice("To Pool", "Pool"),
						new Choice("To Garage", "Garage"),
						new Choice("To Front Grounds", "Front Grounds"),
						new Choice(""),
				};
			}
			case "Front Grounds" -> {
				roomName = roomID;
				roomDesc = "";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.FRONT_GROUNDS);
				choices = new Choice[] {
						new Choice("To Back Grounds", "Back Grounds"),
						new Choice("To Garage", "Garage"),
						new Choice("To Entrance", "Entrance/Fountain"),
						new Choice(""),
				};
			}
			case "Bridge" -> {
				roomName = roomID;
				roomDesc = "You are able to see the chandelier in more detail now because of the height, it is more beautiful than anything you've seen. There is the imperial staircase leading back to the Foyer. You are also able to get to a bedroom to the left, along with a spiral staircase to get up to the third floor. There is also the upper hallway to the right wing on your right.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.BRIDGE);
				choices = new Choice[] {
						new Choice("To Foyer", "Foyer"),
						new Choice("To Bedroom #5", "Bedroom #5"),
						new Choice("To Upper Right Hallway", "Hallway to Upper Right Wing"),
						new Choice("To 3rd Floor", "3rd Floor Study"),
				};
			}
			case "Bedroom #5" -> {
				roomName = roomID;
				roomDesc = "An ugly yellow room that looks like a crazed person designed, the sheets are yellow, as well as the walls. There is also a lot of photos of things in fives on the walls. Quite strange...";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.BED_5);
				choices = new Choice[] {
						new Choice("To Bridge", "Bridge"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Hallway to Upper Right Wing" -> {
				roomName = roomID;
				roomDesc = "It is a decently sized hallway decorated with blunt swords on the walls, and an area rug spanning across the entire hallway. This hallway leads to the foyer, the dinning room, the kitchen, and a stair case to the second floor.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.HALLWAY_TO_URIGHTWING);
				choices = new Choice[] {
						new Choice("To Bridge", "Bridge"),
						new Choice("To Bedroom #2", "Bedroom #2"),
						new Choice("To Loft", "Loft"),
						new Choice(""),
				};
			}
			case "Bedroom #2" -> {
				roomName = roomID;
				roomDesc = "This room is decorated like the many pine forests in the area, everything is green with brown trim and carpet. There are also a lot of pictures on the walls in pairs. Quite strange...";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.BED_2);
				choices = new Choice[] {
						new Choice("To Upper Right Hallway", "Hallway to Upper Right Wing"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Loft" -> {
				roomName = roomID;
				roomDesc = "A decently sized rectangular room that has a small wet bar over to one side. You can get to the Hallway, Stairs to the downstairs hallway, and two bedrooms.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.LOFT);
				choices = new Choice[] {
						new Choice("To Upper Right Hallway", "Hallway to Upper Right Wing"),
						new Choice("To Bedroom #3", "Bedroom #3"),
						new Choice("To Bedroom #4", "Bedroom #4"),
						new Choice("To Lower Right Hallway", "Hallway to Lower Right Wing"),
				};
			}
			case "Bedroom #3" -> {
				roomName = roomID;
				roomDesc = "This looks like a children's room with three beds, and three toy chests. It is a very decorated room with fairytale creatures, like wizards, vampires, gnomes and even werewolves...";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.BED_3);
				choices = new Choice[] {
						new Choice("To Loft", "Loft"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Bedroom #4" -> {
				roomName = roomID;
				roomDesc = "This bedroom is decorated like an ocean with the entire room being a gradient of light blue to navy blue from teh ceiling to the floor. There are a lot of nautical decorations that are in sets of four.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.BED_4);
				choices = new Choice[] {
						new Choice("To Loft", "Loft"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "3rd Floor Study" -> {
				roomName = roomID;
				roomDesc = "All around the room you see shelves upon shelves of books with a beautiful window vies overlooking the back of the estate. In the middle of the room is a desk with a beefy looking PC setup with a wet bar in the corner. On one side of the room there is a spiral staircase leading to the second floor, and on the other is an elevator that can reach to the ground floor.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.THIRD_FLOOR_STUDY);
				choices = new Choice[] {
						new Choice("To Bridge", "Bridge"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Basement Stairs" -> {
				roomName = roomID;
				roomDesc = "You see the staircase leading up to the ground floor, made of wood that is on the verge of the decomposing process and has a single lantern illuminating such a depressing place. The air around you smell musty with the slight hint of rotting corpses, animal or worse... Under the stairs is a dark crevasse that seems void of all light. There is a reinforced wooden door leading to another room.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.BASEMENT_STAIRS);
				choices = new Choice[] {
						new Choice("To Master Suite", "Master Suite"),
						new Choice("To Dungeon Entrance", "Dungeon Entrance"),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Dungeon Entrance" -> {
				roomName = roomID;
				roomDesc = "The entrance room is made from stone bricks that are well aged, with moss lining and spewing from the cracks and creases. You are able to see your surroundings thanks to some scones lining the walls, giving off faint candle light, with some of them out, creating the void darkness you've seen back at the staircase. There are three doors, one that leads to the staircase above, and two more that are currently unknown. You are able to pinpoint the rotting smell to one of the doors.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.DUNGEON_ENTRANCE);
				choices = new Choice[] {
						new Choice("To Basement Stairs", "Basement Stairs"),
						new Choice("To Disposal Room", "Disposal Room"),
						new Choice("To Dungeon Hallway", "Dungeon Hallway"),
						new Choice(""),
				};
			}
			case "Disposal Room" -> {
				roomName = roomID;
				roomDesc = "Inside the room you see piles of rotting corpes of all kinds. Packages of meat from cows, copious amounts of bacon, and the thing that makes you almost puke, a few dozen mangled human corpses hanging on hooks from the ceiling and along the wall. You are able to recognise some of them to be your now former coworkers.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.DISPOSAL_ROOM);
				choices = new Choice[] {
						new Choice("To Dungeon Entrance", "Dungeon Entrance"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Storage" -> {
				roomName = roomID;
				roomDesc = "The room consists of shelves and boxes with various jars, packages, papers and assorted knick knacks. There is a single candle dangling from a small chandalere  illuminating the entire room.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.STORAGE);
				choices = new Choice[] {
						new Choice("To Dungeon Hallway", "Dungeon Hallway"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Dungeon Hallway" -> {
				roomName = roomID;
				roomDesc = "This is a small hallway leading two doors in a corner, with the it going around the corner. Be careful, you don't know what lurks in the shadows...";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.HALLWAY_TO_DUNGEON);
				choices = new Choice[] {
						new Choice("To Dungeon Entrance", "Dungeon Entrance"),
						new Choice("To Storage", "Storage"),
						new Choice("To Study", "Dungeon Study"),
						new Choice("To Holding Area", "Holding Area"),
				};
			}
			case "Dungeon Study" -> {
				roomName = roomID;
				roomDesc = "A small room with shelving above a desk with papers dumped everywhere, in every crevice. Looking at the papers you see multiple revisions of the Vitruvian Man in many different grotesque forms, and dismemberment. one of which looks like it but instead of a human, it looks like a werewolf...";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.DUNGEON_STUDY);
				choices = new Choice[] {
						new Choice("To Hallway in Dungeon", "Dungeon Hallway"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Holding Area" -> {
				roomName = roomID;
				roomDesc = "As you enter you immediately see some puddles of what seems to be fresh blood in the cracks of the floor stones. Entering from the hallway there are jail cells to your right and an ajar door in front of you.";
				isPOI = false;
				roomImg = ImageHandler.getImage(ImageHandler.HOLDING_AREA);
				choices = new Choice[] {
						new Choice("To Dungeon Hallway", "Dungeon Hallway"),
						new Choice("To Laboratory", "Laboratory"),
						new Choice("To Prison/Holding Cell", "Prison/Holding Cell"),
						new Choice(""),
				};
			}
			case "Laboratory" -> {
				roomName = roomID;
				roomDesc = "You enter to see something that puts your stomach to unrest, inside it differs from the usual ascetic of the what you're sen down here. It is a large white room with what looks like dried and fresh blood, and organ juices on the ground and walls. around the room are counterparts with what looks like torture instruments and knives. in the center are three chairs stained. one of which you recognize one of your now deceased coworkers strapped to the chair with their ribs open and some organs missing.";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.LAB);
				choices = new Choice[] {
						new Choice("To Holding Area", "Holding Area"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			case "Prison/Holding Cell" -> {
				roomName = roomID;
				roomDesc = "There are a total of twelve cells one or two holding some recently deceased people. some of the cells are unlocked and open. This looks like what a psychopath would keep in their house. You then remember who you work for...";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.TEST_CELLS);
				choices = new Choice[] {
						new Choice("To Holding Area", "Holding Area"),
						new Choice(""),
						new Choice(""),
						new Choice(""),
				};
			}
			default -> {}
		}
	}
	
	public void draw(Graphics g) {
		g.drawImage(roomImg, 0, 0, SCALED_WIDTH, SCALED_HEIGHT, null);
		Font f = font.deriveFont(DESCRIPTION_PX);
		g.setFont(f);
		main.GamePanel.drawWrappedString(g, roomDesc, (int) (X_OFFSETS * 1.5), SCALED_HEIGHT + Y_OFFSETS + (int) (DESCRIPTION_PX / 4), BOX_WIDTH - 8, f);
	}
	
	public Choice[] getChoices() {
		return choices;
	}
	
	public BufferedImage getRoomImg() {
		return roomImg;
	}
	
	public boolean isPOI() {
		return isPOI;
	}
	
	public String getRoomDesc() {
		return roomDesc;
	}
	
	public String getRoomName() {
		return roomName;
	}
}
