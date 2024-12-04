/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.Game;
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class CardFactory extends CardFactoryAbstractLayer {
    
    @Override 
    public ArrayList<Card> createCards() {
        ArrayList<Card> cards = new ArrayList<Card>();
        for (Values value : Values.values()) {
            for (Suits suit : Suits.values()) {
                cards.add(new Card(value.toString(), suit.toString()));
                
            }
        }
        
        return cards;
        
        
    }
    
}
