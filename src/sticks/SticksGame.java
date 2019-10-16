package sticks;

import java.util.Scanner;

import sticks.AI;
import sticks.Human;
import sticks.Player;

// Game of sticks, main method
// Written by Dave Musicant
public class SticksGame
{

   public static final int MAX = 100;

   public static void playGameOnce(Player player1, Player player2, int totalSticks)
   {
      playGameOnce(player1, player2, totalSticks, true);
   }

   public static void playGameOnce(Player player1, Player player2, int totalSticks, boolean verbose)
   {
      Player current = player1;
      Player next = player2;
      while(totalSticks > 0) {
         if(verbose) {
            System.out.println("There are " + totalSticks + " stick(s) on the board");
         }
         int numSticks = current.move(totalSticks);
         totalSticks -= numSticks;
         Player t = current;
         current = next;
         next = t;

      }
      current.endGame(false);
      next.endGame(true);

   }


   
   public static void main(String[] args)
   {
      // Initial setup
      System.out.println("Welcome to the game of sticks!");
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many sticks are there on the table initally? (10-100)? ");
      int totalSticks = scanner.nextInt();
      while (totalSticks < 10 || totalSticks > MAX)
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
         System.out.println("PreTraining");
         for(int i = 0; i < 10000; i++) {
            Player ai1 = new AI("AI1", false);
            Player ai2 = new AI("AI2", false);
            playGameOnce(ai1,ai2, totalSticks, false);
         }
         Player player1 = new Human("Player 1");
         AI player2 = new AI("Player 2");
         player2.display();
         playGameOnce(player1, player2, totalSticks);
      }
      else
      {
         System.out.println("Bad choice.");
      }
   
   }
}