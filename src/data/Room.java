package data;

import helper.ImageHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

import static data.Seed.seed;

public class Room {
	private boolean visited = false;
	private boolean isPOI = false;
	private String roomName = "";
	private String roomDesc = """
			""";
	private BufferedImage roomImg;
	private int numChoices = 0;
	
	public Room(RoomList roomName) {
		switch (roomName) {
			case ENTRANCE_FOUNTAIN -> {
			}
			case FOYER -> {
			}
			case GREAT_ROOM -> {
			}
			case SITTING_AREA -> {
			}
			case MASTER_SUITE -> {
			}
			case MASTER_SUITE_BATHROOM -> {
			}
			case GROUND_HALLWAY_TO_RIGHT_WING -> {
			}
			case KITCHEN_WETBAR -> {
			}
			case DINING_ROOM -> {
			}
			case FAMILY_ROOM -> {
			}
			case CAR_GARAGE -> {
			}
			case UTILITY_ROOM -> {
			}
			case MUD_ROOM -> {
			}
			case COVERED_SCREEN_LAMAI -> {
			}
			case POOL_AREA -> {
			}
			case BACKHALF_GROUNDS -> {
			}
			case FRONTHALF_GROUNDS -> {
			}
			case BRIDGE_STAIRS_TO_BELOW -> {
			}
			case BEDROOM_5 -> {
			}
			case MID_FLOOR_HALLWAY_TO_RIGHT_WING -> {
			}
			case BEDROOM_2 -> {
			}
			case MID_FLOOR_LOFT_WET_BAR -> {
			}
			case BEDROOM_3 -> {
			}
			case BEDROOM_4 -> {
			}
			case TOP_FLOOR_STUDY_WET_BAR -> {
			}
			case DUNGEON_STAIRS -> {
			}
			case DUNGEON_ENTRANCE -> {
			}
			case DISPOSAL_ROOM -> {
			}
			case STORAGE -> {
			}
			case DUNGEON_HALLWAY -> {
			}
			case BASEMENT_STUDY -> {
			}
			case HOLDING_AREA -> {
			}
			case LABORATORIES -> {
			}
			case JAIL_TEST_CELLS -> {
			}
			default -> {
				this.roomName = "Placeholder Room";
				this.roomDesc = """
						This is placeholder text for a room that should not and will not exist in the final version of the game.
						If you see this during the full release, give yourself a cookie, because this is hella hard, I mean damn near impossible to get to.
						Kudos to you!
						""";
				this.isPOI = false;
				this.numChoices = 4;
				this.roomImg = ImageHandler.getImage(ImageHandler.PLACEHOLDER);
			}
		}
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
	
	public int getNumChoices() {
		return numChoices;
	}
	
	public void draw(Graphics g) {
		g.drawImage(roomImg, 0, 0, roomImg.getWidth() * 10, roomImg.getHeight() * 10, null);
	}
}
