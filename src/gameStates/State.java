package gameStates;

import java.awt.event.MouseEvent;

//import audio.AudioPlayer;
import main.Game;
//import ui.MenuButton;

public class State {
	
	protected Game game;
	
	public State(Game game) {
		this.game = game;
	}
	
	
	public Game getGame() {
		return game;
	}
	
	@SuppressWarnings("incomplete-switch")
	public void setGamestate(GameStates state) {
		switch (state) {
//			case MAIN_MENU -> game.getAudioPlayer().playSong(AudioPlayer.MENU_1);
//			case PLAY -> game.getAudioPlayer().setLevelSong(game.getPlaying().getLevelManager().getLevelIndex());
		}
		
		GameStates.state = state;
	}
	
}