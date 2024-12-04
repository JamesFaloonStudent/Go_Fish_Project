package ca.sheridancollege.Game;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {

	private String username;
	private String password;
	private int score;
	private Card[] hand;

	/**
	 * A constructor that allows you to set the player's unique ID
	 * @param name the unique ID to assign to this player.
	 */
	public Player(String username, String password) {
            this.username = username;
            this.password = password;
	    
	}

	/**
	 * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
	 * with logic to play your game.
	 */
	public void play() {
		// TODO - implement Player.play
		throw new UnsupportedOperationException();
	}

	public String getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return this.score;
	}

	/**
	 * 
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}

	public Card[] getHand() {
		return this.hand;
	}

	/**
	 * 
	 * @param hand
	 */
	public void setHand(Card[] hand) {
		this.hand = hand;
	}

}