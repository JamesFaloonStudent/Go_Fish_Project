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
	private Game(String name, ArrayList<Player> players) {
            this.name = name;
            this.players = players;                       
	}
        
        
        

	/**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public void play(ArrayList<Card> deck, ArrayList<Player> players) {
            Scanner input = new Scanner(System.in);
            int totalTurn = 5;
            while (totalTurn > 0) {
                for (Player player : players) {                
                    
                    Turn turn = new Turn();
                    System.out.print("Prompt for card: ");
                    String command = input.next();
                    System.out.print("prompt for player: ");
                    String inputtedPlayer = input.next();
                    if (command.equals("exit")) {
                        DeclareWinner.checkWinner();                 

                    }

                    if (command.equals("check")) {
                        System.out.println(player.getHand());
                    }

                    boolean check = false;
                    Player otherPlayer = null;
                    for (Player player2 : players) {
                        if (player2.getUsername().equals(inputtedPlayer)) {
                            otherPlayer = player2;
                            check = turn.checkCard(command, player2);
                        }
                    }
                    System.out.println(deck.size());
                    
                   if (check) {
                        turn.swapCard(command, player, otherPlayer);  // Swap card if check is true
                   } else if (command.equals("check")) {
                        continue;  // If the command is "check", skip to the next iteration of the loop
                   } else {
                        turn.goFish(deck, player);  // Otherwise, player goes fish
                   }
                    
                    totalTurn--;
                    
                }
               
                
                
                
                
                
            }
            
            
            
	}
        
        
        public static Game getInstance() {
            if (Game.game == null) {
                Game.game  = new Game("Go fish", new ArrayList<Player>());
            }            
            return Game.game;
        }
        
        
         public static void main(String[] args) {
             Game.game = Game.getInstance();
             PlayerFactoryAbstractLayer playerFactory = new PlayerFactory();
             ArrayList<Card> deck = GroupOfCards.initializeDeck().getCards();
             ArrayList<Player> players = playerFactory.createPlayers();            
             Game.game.play(deck, players);
             
            
        }	

}