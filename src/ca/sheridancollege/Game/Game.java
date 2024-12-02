package ca.sheridancollege.Game;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Game {
    
        private String name;
        private static Game game;
        private ArrayList<Player> players;
        
    
       

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
	private Game(String name, int numOfPlayers) {
                       
	}
        
        
        

	/**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public void play() {
		// TODO - implement Game.play
		throw new UnsupportedOperationException();
	}
        
        
        public static Game getInstance() {
            if (Game.game == null) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter number of players must be at least 2 ");
                int numOfPlayers = input.nextInt();
                while (numOfPlayers < 2) {
                    System.out.print("Invalid number of players try again");
                    numOfPlayers = input.nextInt();
                }
                return new Game("Go fish", numOfPlayers);
            }
            
            return Game.game;
        }
        
        
         public static void main(String[] args) {
             Game.game = Game.getInstance();
             Game.game.play();
             
            
        }	

}