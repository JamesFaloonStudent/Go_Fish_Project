package ca.sheridancollege.Game;

import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {
        private static GroupOfCards deck;
	private int size;
	/**
	 * The group of cards, stored in an ArrayList
	 */
	private Collection<Card> cards;

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Collection<Card> getCards() {
		return this.cards;
	}

	/**
	 * the size of the grouping
	 * @param size
	 */
	private GroupOfCards(int size) {
            for (int i = 0; i < size; i++) {
                this.cards.add(new Card());
            }
	}

	public static GroupOfCards initializeDeck() {
            if (GroupOfCards.deck == null) {
                GroupOfCards.deck = new GroupOfCards(54);
            }
            return GroupOfCards.deck;
	}

}