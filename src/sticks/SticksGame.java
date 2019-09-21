package sticks;

import java.util.Scanner;

// Game of sticks, main method
// Written by Dave Musicant
public class SticksGame
{

   public static void playGameOnce(Player player1, Player player2, int totalSticks)
   {
      System.out.println("Here is where the game shall be played!");
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