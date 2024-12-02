package ca.sheridancollege.Game;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * 
 * @author dancye
 */
public class Card {

	private int value;
	private String face;
        
        
        public Card() {
            
        }

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	@Override
	public String toString() {
		// TODO - implement Card.toString
		throw new UnsupportedOperationException();
	}

	public int getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	public String getFace() {
		return this.face;
	}

	/**
	 * 
	 * @param face
	 */
	public void setFace(String face) {
		this.face = face;
	}

}