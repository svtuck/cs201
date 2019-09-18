import java.util.*;

public class GuessingGame {
    static boolean done = false;

    public boolean check(int guess, int magicNumber) {

        //We can pull this next part into a function, this becomes 'static' in Java
        if (guess > magicNumber) {
            System.out.println("Too high, guess again: ");
            done = false;
        } else if (guess < magicNumber) {
            System.out.println("Too low, guess again: ");
            done = false;
        } else {
            System.out.println("Correct!");
            done = true;
        }
        return done;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game");

        // Generate a secret number, yes you can use randint
        //magic_number = (int) (random.random() * 100) + 1
        int magicNumber = 42;

        // Print the number
        System.out.println("shh, the magic number is: " + magicNumber);

        // Prompt user for input
        System.out.println("Guess a number: ");

        boolean done = false;
        // Until they guess the correct number, give them high/low prompts and repeat

        Scanner input = new Scanner(System.in);


        GuessingGame game = new GuessingGame();
        int guess;

        while (!done) {
            //guess = int(input())
            guess = input.nextInt();
            done = game.check(guess, magicNumber);

        }
    }
}