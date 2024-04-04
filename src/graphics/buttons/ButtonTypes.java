package graphics.buttons;

import helper.ImageHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

import static helper.UIConstants.Buttons.DiffSelector.DIFF_HEIGHT;
import static helper.UIConstants.Buttons.DiffSelector.DIFF_WIDTH;
import static helper.UIConstants.Buttons.GameOverButton.GAME_OVER_HEIGHT;
import static helper.UIConstants.Buttons.GameOverButton.GAME_OVER_WIDTH;
import static helper.UIConstants.Buttons.GuessButtons.GUESS_HEIGHT;
import static helper.UIConstants.Buttons.GuessButtons.GUESS_WIDTH;
import static helper.UIConstants.Buttons.MenuStates.*;
import static helper.UIConstants.Buttons.PlayState.*;

public enum ButtonTypes {
	SETTINGS(SETTINGS_WIDTH,
			SETTINGS_HEIGHT,
			ImageHandler.getImage(ImageHandler.SETTINGS_BUTTON),
			new Rectangle(SETTINGS_WIDTH, SETTINGS_HEIGHT)),
	INVENTORY(INVENTORY_WIDTH,
			INVENTORY_HEIGHT,
			ImageHandler.getImage(ImageHandler.TOP_BUTTON_SS),
			new Rectangle(INVENTORY_WIDTH, INVENTORY_HEIGHT)),
	MAP(MAP_WIDTH,
			MAP_HEIGHT,
			ImageHandler.getImage(ImageHandler.TOP_BUTTON_SS),
			new Rectangle(MAP_WIDTH, MAP_HEIGHT)),
	CLUE_MENU(CLUES_MENU_WIDTH,
			CLUES_MENU_HEIGHT,
			ImageHandler.getImage(ImageHandler.CLUE_MENU_BUTTON),
			new Rectangle(CLUES_MENU_WIDTH, CLUES_MENU_HEIGHT)),
	CREDITS(CREDITS_WIDTH,
			CREDITS_HEIGHT,
			ImageHandler.getImage(ImageHandler.CREDITS_BUTTON),
			new Rectangle(CREDITS_WIDTH, CREDITS_HEIGHT)),
	SAVE_AND_EXIT(SAVE_AND_QUIT_WIDTH,
			SAVE_AND_QUIT_HEIGHT,
			ImageHandler.getImage(ImageHandler.SAVE_AND_QUIT_BUTTON),
			new Rectangle(SAVE_AND_QUIT_WIDTH, SAVE_AND_QUIT_HEIGHT)),
	CHOICE(CHOICE_WIDTH,
			CHOICE_HEIGHT,
			ImageHandler.getImage(ImageHandler.CHOICE_BUTTON),
			new Rectangle(CHOICE_WIDTH, CHOICE_HEIGHT)),
	LOAD_FROM_SAVE(LOAD_GAME_WIDTH,
			LOAD_GAME_HEIGHT,
			ImageHandler.getImage(ImageHandler.LOAD_FROM_SAVE_BUTTON),
			new Rectangle(LOAD_GAME_WIDTH, LOAD_GAME_HEIGHT)),
	NEW_GAME(NEW_GAME_WIDTH,
			NEW_GAME_HEIGHT,
			ImageHandler.getImage(ImageHandler.NEW_GAME_BUTTON),
			new Rectangle(NEW_GAME_WIDTH, NEW_GAME_HEIGHT)),
	BACK(BACK_WIDTH,
			BACK_HEIGHT,
			ImageHandler.getImage(ImageHandler.BACK_BUTTON),
			new Rectangle(BACK_WIDTH, BACK_HEIGHT)),
	CONTINUE(CONTINUE_WIDTH,
			CONTINUE_HEIGHT,
			ImageHandler.getImage(ImageHandler.CONTINUE_BUTTON),
			new Rectangle(CONTINUE_WIDTH, CONTINUE_HEIGHT)),
	NORMAL(DIFF_WIDTH,
			DIFF_HEIGHT,
			ImageHandler.getImage(ImageHandler.NORM_DIFF_BUTTON),
			new Rectangle(DIFF_WIDTH, DIFF_HEIGHT)),
	HARD(DIFF_WIDTH,
			DIFF_HEIGHT,
			ImageHandler.getImage(ImageHandler.HARD_DIFF_BUTTON),
			new Rectangle(DIFF_WIDTH, DIFF_HEIGHT)),
	CLUE_BUTTON(CLUE_WIDTH,
			CLUE_HEIGHT,
			ImageHandler.getImage(ImageHandler.CHOICE_BUTTON),
			new Rectangle(CLUE_WIDTH, CLUE_HEIGHT)),
	GUESS_BUTTON(GUESS_WIDTH,
			GUESS_HEIGHT,
			ImageHandler.getImage(ImageHandler.GUESS_BUTTON),
			new Rectangle(GUESS_WIDTH, GUESS_HEIGHT)),
	RESTART_BUTTON(GAME_OVER_WIDTH,
			GAME_OVER_HEIGHT,
			ImageHandler.getImage(ImageHandler.NEW_GAME_BUTTON),
			new Rectangle(GAME_OVER_WIDTH, GAME_OVER_HEIGHT));
	
	public final int width, height;
	public final BufferedImage img;
	public final Rectangle bounds;
	ButtonTypes(int width, int height, BufferedImage img, Rectangle bounds) {
		this.width = width;
		this.height = height;
		this.img = img;
		this.bounds = bounds;
	}
}
