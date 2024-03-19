package data;

import helper.ImageHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

import static helper.UIConstants.Buttons.X_OFFSETS;
import static helper.UIConstants.Buttons.Y_OFFSETS;
import static helper.UIConstants.Description.BOX_HEIGHT;
import static helper.UIConstants.Description.BOX_WIDTH;
import static helper.UIConstants.RoomImage.SCALED_HEIGHT;
import static helper.UIConstants.RoomImage.SCALED_WIDTH;
import static helper.UIConstants.Text.DESCRIPTION_PX;
import static main.GamePanel.font;

public enum Room {
	ENTRANCE_FOUNTAIN("Entrance",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.MANSION_ENTRANCE),
			false),
	
	FOYER("Foyer",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.FOYER),
			false),
	GREAT_ROOM("Great Room",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.GREAT_ROOM),
			false),
	SITTING_AREA("Sitting Area",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.SITTING_AREA),
			false),
	MASTER_SUITE("Master Suite",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.MASTER_SUITE),
			false),
	MASTER_SUITE_BATHROOM("Master Suite Bathroom",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.MASTER_SUITE_BATHROOM),
			false),
	GROUND_HALLWAY_TO_RIGHT_WING("Ground Floor Hallway to Right Wing",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.HALLWAY_TO_LRIGHTWING),
			false),
	KITCHEN_WETBAR("Kitchen",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.KITCHEN),
			false),
	DINING_ROOM("Dining Room",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.DINING_ROOM),
			false),
	FAMILY_ROOM("Family Room",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.FAMILY_ROOM),
			false),
	CAR_GARAGE("4 Car Garage",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.GARAGE),
			false),
	UTILITY_ROOM("Utility Room",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.UTILITY_ROOM),
			false),
	MUD_ROOM("Mud Room",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.MUD_ROOM),
			false),
	COVERED_SCREEN_LAMAI("Screen-Covered Lamai",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.LAMAI),
			false),
	POOL_AREA("Pool Area",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.POOL_AREA),
			false),
	BACKHALF_GROUNDS("Back Grounds",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.BACK_GROUNDS),
			false),
	FRONTHALF_GROUNDS("Front Grounds",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.FRONT_GROUNDS),
			false),
	BRIDGE_STAIRS_TO_BELOW("Second Floor Bridge",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.BRIDGE),
			false),
	BEDROOM_5("Bedroom #5",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.BED_5),
			false),
	MID_FLOOR_HALLWAY_TO_RIGHT_WING("Upper Right Wing Hallway",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.HALLWAY_TO_URIGHTWING),
			false),
	BEDROOM_2("Bedroom #2",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.BED_2),
			false),
	MID_FLOOR_LOFT_WET_BAR("Loft/Wet Bar",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.LOFT),
			false),
	BEDROOM_3("Bedroom #3",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.BED_3),
			false),
	BEDROOM_4("Bedroom #4",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.BED_4),
			false),
	TOP_FLOOR_STUDY_WET_BAR("Third Floor Study",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.THIRD_FLOOR_STUDY),
			false),
	DUNGEON_STAIRS("Basement Stairs",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.BASEMENT_STAIRS),
			false),
	DUNGEON_ENTRANCE("Dungeon Entrance",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.DUNGEON_ENTRANCE),
			false),
	DISPOSAL_ROOM("Disposal Room",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.DISPOSAL_ROOM),
			false),
	STORAGE("Storage Closet",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.STORAGE),
			false),
	DUNGEON_HALLWAY("Dungeon Hallway",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.HALLWAY_TO_DUNGEON),
			false),
	BASEMENT_STUDY("Study",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.DUNGEON_STUDY),
			false),
	HOLDING_AREA("Holding Area",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.HOLDING_AREA),
			false),
	LABORATORIES("Laboratories",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.LAB),
			false),
	JAIL_TEST_CELLS("Test Cells",
			"""
					""",
			false,
			new Choice[]{
					new Choice("Choice 1")
			},
			ImageHandler.getImage(ImageHandler.TEST_CELLS),
			false),
	PLACEHOLDER("Placeholder Room",
			"""
			This is placeholder text for a room that should not and will not exist in the final version of the game.
			If you see this during the full release, give yourself a cookie, because this is hella hard, I mean damn near impossible to get to.
			Kudos to you!
			""",
			false,
			new Choice[]{
					new Choice("Choice 1"),
					new Choice("Choice 2 (Foyer)", FOYER),
					new Choice("Choice 3"),
					new Choice("Choice 4 (Disposal Room)", DISPOSAL_ROOM)},
			ImageHandler.getImage(ImageHandler.PLACEHOLDER),
			false
			);
	
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
				new Choice("Choice 2 (Foyer)"),
				new Choice("Choice 3"),
				new Choice("Choice 4 (Disposal Room)")};
		
		this.roomImg = ImageHandler.getImage(ImageHandler.PLACEHOLDER);
	}
	
	Room(String roomName, String roomDesc, boolean isPOI, Choice[] choices, BufferedImage roomImg, boolean visited) {
		this.roomName = roomName;
		this.roomDesc = roomDesc;
		this.isPOI = isPOI;
		this.choices = choices;
		this.roomImg = roomImg;
		this.visited = visited;
	}
	
	public void draw(Graphics g) {
		g.drawImage(roomImg, 0, 0, SCALED_WIDTH, SCALED_HEIGHT, null);
		g.drawImage(ImageHandler.getImage(ImageHandler.CHOICE_BUTTON), 0, SCALED_HEIGHT, BOX_WIDTH, BOX_HEIGHT, null);
		
		Font f = font.deriveFont(DESCRIPTION_PX);
		g.setFont(f);
		main.GamePanel.drawWrappedString(g, roomDesc, (int)(X_OFFSETS * 1.5), SCALED_HEIGHT + Y_OFFSETS + (int)(DESCRIPTION_PX/4), BOX_WIDTH - 8, f);
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