package ca.sheridancollege.Game;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * 
 * @author dancye
 */
public class Card {

	private String value;
	private String face;
        
        
        public Card(String value, String face) {
            this.value = value;
            this.face = face;
            
        }

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	@Override
	public String toString() {
            return this.getValue()+ " of " + this.getFace();
	}

	public String getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(String value) {
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