import java.util.Scanner;

import sticks.AI;
import sticks.Human;
import sticks.Player;

// Game of sticks, main method
// Written by Dave Musicant
public class SticksGame
{

   public static void playGameOnce(Player player1, Player player2, int totalSticks)
   {
      Player current = player1;
      Player next = player2;
      while(totalSticks > 0) {
         System.out.println("There are " + totalSticks + "(s) on the board");
         int numSticks = current.move(totalSticks);
         totalSticks -= numSticks;
         Player t = current;
         current = next;
         next = t;

      }
      current.endGame(false);
      current.endGame(true);

      signOff(player1);
      signOff(player2);
   }

   private static void signOff(AI ai) {
      System.out.println("AI");
   }

   private static void signOff(Human h) {
      System.out.println("human");
   }

   private static void signOff(Player h) {
      System.out.println("player");
   }
   
   public static void main(String[] args)
   {
      // Initial setup
      System.out.println("Welcome to the game of sticks!");
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many sticks are there on the table initally? (10-100)? ");
      int totalSticks = scanner.nextInt();
      while (totalSticks < 10 || totalSticks > 100)
      {
         System.out.println("Please enter a number between 10 and 100.");
         System.out.print("How many sticks are there on the table initally? (10-100)? ");
         totalSticks = scanner.nextInt();
      }
      
      System.out.println("Options:");
      System.out.println("Play against a friend (1)");
      System.out.println("Play against the computer (2)");
      System.out.print("Which option do you take (1-2)? ");
      int option = scanner.nextInt();
    
      // Choose which game: 1 = human v human, 2 = human v AI  
      if (option == 1)
      {
         Player player1 = new Human("Player 1");
         Player player2 = new Human("Player 2");
         playGameOnce(player1, player2, totalSticks);
      }
      else if (option == 2)
      {
         Player player1 = new Human("Player 1");
         Player player2 = new AI("Player 2");
         playGameOnce(player1, player2, totalSticks);
      }
      else
      {
         System.out.println("Bad choice.");
      }
   
   }
}