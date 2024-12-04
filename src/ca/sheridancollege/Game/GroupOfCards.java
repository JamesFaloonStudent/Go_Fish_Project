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
	private ArrayList<Card> cards;
        
        /**
	 * the size of the grouping
	 * @param size
	 */
	private GroupOfCards(ArrayList<Card> cards) {
            this.cards = cards;
            
            
	}

	public Collection<Card> getCards() {
		return this.cards;
	}

	

	public static GroupOfCards initializeDeck() {
            if (GroupOfCards.deck == null) {
                CardFactoryAbstractLayer cardFactory = new CardFactory();
                ArrayList<Card> cards = cardFactory.createCards();
                GroupOfCards.deck = new GroupOfCards(cards);
            }
            return GroupOfCards.deck;
	}

}