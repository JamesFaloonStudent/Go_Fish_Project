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
	private Game(String name, ArrayList<Player> starterPlayers) {
            this.name = name;
            this.players = starterPlayers;                       
	}
        
        
        

	/**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public void play() {
            System.out.println("Made it here");
	}
        
        
        public static Game getInstance() {
            if (Game.game == null) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter number of players must be at least 2: ");
                int numOfPlayers = input.nextInt();
                while (numOfPlayers < 2) {
                    System.out.print("Invalid number of players try again: ");
                    numOfPlayers = input.nextInt();
                }
                ArrayList<Player> players = new ArrayList<Player>();
                input.nextLine();
                for (int i = 0; i < numOfPlayers; i++) {
                    System.out.print("Enter player " + (i + 1) + " username: ");
                    String username = input.nextLine();
                    System.out.print("Enter player " + (i + 1) + " password: ");
                    String password = input.nextLine();
                    players.add(new Player(username, password));
                }
               
                
                Game.game  = new Game("Go fish", players);
            }
            
            return Game.game;
        }
        
        
         public static void main(String[] args) {
             Game.game = Game.getInstance();
             Game.game.play();
             
            
        }	

}