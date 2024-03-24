package data;

import helper.ImageHandler;

import java.awt.image.BufferedImage;

public class Rooms {
	public static String currRoomID = "Foyer";
	
	
	private String roomName = "";
	private String roomDesc = """
            """;
	private boolean isPOI;
	private BufferedImage roomImg;
	private Choice[] choices;
	
	public void changeRoom(String roomID) {
		switch (roomID) {
			case "Foyer" -> {
				roomName = roomID;
				roomDesc = """
						This is a Foyer desc
						""";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.FOYER);
				choices = new Choice[] {
						new Choice("Kitchen"),
						new Choice("a"),
						new Choice("b"),
						new Choice("c"),
				};
			}
			case "Kitchen" -> {
				roomName = roomID;
				roomDesc = """
						This is a Kitchen desc
						""";
				isPOI = true;
				roomImg = ImageHandler.getImage(ImageHandler.KITCHEN);
				choices = new Choice[] {
						new Choice("Foyer"),
						new Choice("a"),
						new Choice("b"),
						new Choice("c"),
				};
			}
		}
	}
}
