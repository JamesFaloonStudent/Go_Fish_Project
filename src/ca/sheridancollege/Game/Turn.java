package ca.sheridancollege.Game;
import java.util.ArrayList;
public class Turn {
    public boolean checkCard(String value, Player player2) {
        ArrayList<Card> cards = player2.getHand();
        
        for (Card card : cards) {
            if (card.getValue().equals(value)) {
                return true;
            }
        }
        
        
        return false;
        
    }
    
    
   public void swapCard(String value, Player player1, Player player2) {
    ArrayList<Card> toSwap = new ArrayList<Card>();
    ArrayList<Card> hand = player2.getHand();  // Get player2's hand
    
    // Find cards to swap
    for (Card card : hand) {
        if (card.getValue().equals(value)) {
            toSwap.add(card);
        }
    }
    
    // Remove swapped cards from player2's hand
    hand.removeAll(toSwap);  // Safely remove all cards that need to be swapped
    
    // Add swapped cards to player1's hand
    for (Card swap : toSwap) {
        player1.getHand().add(swap);
    }
    
    // Update player2's hand after removal
    player2.setHand(hand);  // This line may be unnecessary if player2's hand is modified directly
}

    public void goFish(ArrayList<Card> deck, Player player1) {
        if (!deck.isEmpty()) {
            player1.getHand().add(deck.remove(deck.size() - 1));  // Add a card from deck to player1
        }
    }
        
        
        

	

}