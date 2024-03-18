package data;

import helper.ImageHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

import static helper.UIConstants.RoomImage.SCALED_HEIGHT;
import static helper.UIConstants.RoomImage.SCALED_WIDTH;

public enum Room {
	ENTRANCE_FOUNTAIN,
	FOYER,
	GREAT_ROOM,
	SITTING_AREA,
	MASTER_SUITE,
	MASTER_SUITE_BATHROOM,
	GROUND_HALLWAY_TO_RIGHT_WING,
	KITCHEN_WETBAR,
	DINING_ROOM,
	FAMILY_ROOM,
	CAR_GARAGE,
	UTILITY_ROOM,
	MUD_ROOM,
	COVERED_SCREEN_LAMAI,
	POOL_AREA,
	BACKHALF_GROUNDS,
	FRONTHALF_GROUNDS,
	BRIDGE_STAIRS_TO_BELOW,
	BEDROOM_5,
	MID_FLOOR_HALLWAY_TO_RIGHT_WING,
	BEDROOM_2,
	MID_FLOOR_LOFT_WET_BAR,
	BEDROOM_3,
	BEDROOM_4,
	TOP_FLOOR_STUDY_WET_BAR,
	DUNGEON_STAIRS,
	DUNGEON_ENTRANCE,
	DISPOSAL_ROOM,
	STORAGE,
	DUNGEON_HALLWAY,
	BASEMENT_STUDY,
	HOLDING_AREA,
	LABORATORIES,
	JAIL_TEST_CELLS,
	PLACEHOLDER();
	
	public static Room currRoom = PLACEHOLDER;
	
	private String roomName = "";
	private String roomDesc = """
			""";
	private boolean isPOI = false;
	private BufferedImage roomImg;
	private Choice[] choices;
	private boolean visited = false;
	
	Room() {
		this.roomName = "Placeholder Room";
		this.roomDesc = """
				This is placeholder text for a room that should not and will not exist in the final version of the game.
				If you see this during the full release, give yourself a cookie, because this is hella hard, I mean damn near impossible to get to.
				Kudos to you!
				""";
		this.isPOI = false;
		this.choices = new Choice[]{
				new Choice("Choice 1"),
				new Choice("Choice 2"),
				new Choice("Choice 3"),
				new Choice("Choice 4")};
		
		this.roomImg = ImageHandler.getImage(ImageHandler.PLACEHOLDER);
	}
	
	Room(String roomName, String roomDesc, boolean isPOI, Choice[] choices, BufferedImage roomImg, boolean visited) {
	
	}
	
	public void draw(Graphics g) {
		g.drawImage(roomImg, 0, 0, SCALED_WIDTH, SCALED_HEIGHT, null);
	}
	
	public void setVisited() {
		visited = true;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public boolean isPOI() {
		return isPOI;
	}
	
	public String getRoomName() {
		return roomName;
	}
	
	public String getRoomDesc() {
		return roomDesc;
	}
	
	public BufferedImage getRoomImg() {
		return roomImg;
	}
	
	public Choice getChoice(int i) {
		if (i > choices.length-1 || i < 0)
			throw new IndexOutOfBoundsException();
		return choices[i];
	}
}
