/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.Game;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author james
 */
public class PlayerFactory extends PlayerFactoryAbstractLayer {
    
      @Override 
      public ArrayList<Player> createPlayers() {
        Validator passwordValidator = new PasswordValidator(); 
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
          while (!passwordValidator.validate(password)) {
            System.out.print("credentials invalid please enter your username: ");
            username = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();              
          } 
          players.add(new Player(username, password));
          
        }
        return players;
      }
        
              
                 
                           
}
