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
public abstract class CardFactoryAbstractLayer {
    enum Values {
        One, 
        Two, 
        Three,
        Four,
        Five, 
        Six,
        Seven,
        Eight,
        Nine,
        Ten, 
        Jack,
        Queen,
        King
    }
    
    enum Suits {
        Spades,
        Hearts,
        Diamonds,
        Clubs
    }
    public abstract ArrayList<Card> createCards ();
    
    
    
}
