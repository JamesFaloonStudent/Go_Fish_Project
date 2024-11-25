package ca.sheridancollege.Game;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Game {
    
        public static void main(String[] args) {
            play();
        }

	private final String name;
	/**
	 * the title of the game
	 */
	private java.util.ArrayList<ca.sheridancollege.Game.Player> players;

	public String getName() {
		return this.name;
	}

	public java.util.ArrayList<ca.sheridancollege.Game.Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(java.util.ArrayList<ca.sheridancollege.Game.Player> players) {
		this.players = players;
	}

	/**
	 * the players of the game
	 * @param name
	 */
	public Game(String name) {
		// TODO - implement Game.Game
		throw new UnsupportedOperationException();
	}
        
        
        

	/**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public static void play() {
		// TODO - implement Game.play
		throw new UnsupportedOperationException();
	}

}