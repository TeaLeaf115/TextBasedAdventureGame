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

public class Room {
	public static Room ENTRANCE_FOUNTAIN = new Room("Entrance",
			                                     """
					""",
			                                     false,
			                                     new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.MANSION_ENTRANCE),
			false);
	
	public static Room FOYER = new Room("Foyer",
			      """
					""",
			      false,
			      new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.FOYER),
			false);
	public static Room GREAT_ROOM = new Room("Great Room",
			           """
					""",
			           false,
			           new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.GREAT_ROOM),
			false);
	public static Room SITTING_AREA = new Room("Sitting Area",
			             """
					""",
			             false,
			             new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.SITTING_AREA),
			false);
	public static Room MASTER_SUITE = new Room("Master Suite",
			             """
					""",
			             false,
			             new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.MASTER_SUITE),
			false);
	public static Room MASTER_SUITE_BATHROOM = new Room("Master Suite Bathroom",
			                      """
					""",
			                      false,
			                      new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.MASTER_SUITE_BATHROOM),
			false);
	public static Room GROUND_HALLWAY_TO_RIGHT_WING = new Room("Ground Floor Hallway to Right Wing",
			                             """
					""",
			                             false,
			                             new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.HALLWAY_TO_LRIGHTWING),
			false);
	public static Room KITCHEN_WETBAR = new Room("Kitchen",
			               """
					""",
			               false,
			               new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.KITCHEN),
			false);
	public static Room DINING_ROOM = new Room("Dining Room",
			            """
					""",
			            false,
			            new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.DINING_ROOM),
			false);
	public static Room FAMILY_ROOM = new Room("Family Room",
			            """
					""",
			            false,
			            new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.FAMILY_ROOM),
			false);
	public static Room CAR_GARAGE = new Room("4 Car Garage",
			           """
					""",
			           false,
			           new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.GARAGE),
			false);
	public static Room UTILITY_ROOM = new Room("Utility Room",
			             """
					""",
			             false,
			             new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.UTILITY_ROOM),
			false);
	public static Room MUD_ROOM = new Room("Mud Room",
			         """
					""",
			         false,
			         new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.MUD_ROOM),
			false);
	public static Room COVERED_SCREEN_LAMAI = new Room("Screen-Covered Lamai",
			                     """
					""",
			                     false,
			                     new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.LAMAI),
			false);
	public static Room POOL_AREA = new Room("Pool Area",
			          """
					""",
			          false,
			          new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.POOL_AREA),
			false);
	public static Room BACKHALF_GROUNDS = new Room("Back Grounds",
			                 """
					""",
			                 false,
			                 new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.BACK_GROUNDS),
			false);
	public static Room FRONTHALF_GROUNDS = new Room("Front Grounds",
			                  """
					""",
			                  false,
			                  new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.FRONT_GROUNDS),
			false);
	public static Room BRIDGE_STAIRS_TO_BELOW = new Room("Second Floor Bridge",
			                       """
					""",
			                       false,
			                       new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.BRIDGE),
			false);
	public static Room BEDROOM_5 = new Room("Bedroom #5",
			          """
					""",
			          false,
			          new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.BED_5),
			false);
	public static Room MID_FLOOR_HALLWAY_TO_RIGHT_WING = new Room("Upper Right Wing Hallway",
			                                """
					""",
			                                false,
			                                new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.HALLWAY_TO_URIGHTWING),
			false);
	public static Room BEDROOM_2 = new Room("Bedroom #2",
			          """
					""",
			          false,
			          new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.BED_2),
			false);
	public static Room MID_FLOOR_LOFT_WET_BAR = new Room("Loft/Wet Bar",
			                       """
					""",
			                       false,
			                       new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.LOFT),
			false);
	public static Room BEDROOM_3 = new Room("Bedroom #3",
			          """
					""",
			          false,
			          new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.BED_3),
			false);
	public static Room BEDROOM_4 = new Room("Bedroom #4",
			          """
					""",
			          false,
			          new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.BED_4),
			false);
	public static Room TOP_FLOOR_STUDY_WET_BAR = new Room("Third Floor Study",
			                        """
					""",
			                        false,
			                        new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.THIRD_FLOOR_STUDY),
			false);
	public static Room DUNGEON_STAIRS = new Room("Basement Stairs",
			               """
					""",
			               false,
			               new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.BASEMENT_STAIRS),
			false);
	public static Room DUNGEON_ENTRANCE = new Room("Dungeon Entrance",
			                 """
					""",
			                 false,
			                 new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.DUNGEON_ENTRANCE),
			false);
	public static Room DISPOSAL_ROOM = new Room("Disposal Room",
			              """
					""",
			              true,
			              new Choice[]{
								  new Choice("Choice 1"),
					              new Choice("Choice 2"),
					              new Choice("Choice 3"),
					              new Choice("Choice 4")
	},
			ImageHandler.getImage(ImageHandler.DISPOSAL_ROOM),
			false);
	public static Room STORAGE = new Room("Storage Closet",
			        """
					""",
			        false,
			        new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.STORAGE),
			false);
	public static Room DUNGEON_HALLWAY = new Room("Dungeon Hallway",
			                """
					""",
			                false,
			                new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.HALLWAY_TO_DUNGEON),
			false);
	public static Room BASEMENT_STUDY = new Room("Study",
			               """
					""",
			               false,
			               new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.DUNGEON_STUDY),
			false);
	public static Room HOLDING_AREA = new Room("Holding Area",
			             """
					""",
			             false,
			             new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.HOLDING_AREA),
			false);
	public static Room LABORATORIES = new Room("Laboratories",
			             """
					""",
			             false,
			             new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.LAB),
			false);
	public static Room JAIL_TEST_CELLS = new Room("Test Cells",
			                """
					""",
			                false,
			                new Choice[]{
		new Choice("Choice 1")
	},
			ImageHandler.getImage(ImageHandler.TEST_CELLS),
			false);
	public static Room PLACEHOLDER = new Room("Placeholder Room",
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
	
	public Room() {
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
	
	public Room(String roomName, String roomDesc, boolean isPOI, Choice[] choices, BufferedImage roomImg, boolean visited) {
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
		main.GamePanel.drawWrappedString(g, roomDesc, (int) (X_OFFSETS * 1.5), SCALED_HEIGHT + Y_OFFSETS + (int) (DESCRIPTION_PX / 4), BOX_WIDTH - 8, f);
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
		if (i > choices.length - 1 || i < 0)
			throw new IndexOutOfBoundsException();
		return choices[i];
	}
}