package ca.sheridancollege.Game;

import java.util.Collections;
import java.util.ArrayList;
public class Shuffle {

	private Card[] deck;

	public static ArrayList<Card> shuffle(ArrayList<Card> cards) {
            Collections.shuffle(cards);
            return cards;
	}

	public Card[] getDeck() {
		return this.deck;
	}

	/**
	 * 
	 * @param deck
	 */
	public void setDeck(Card[] deck) {
		this.deck = deck;
	}

}