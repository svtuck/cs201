package sticks;

import java.util.Scanner;

public class Human implements Player {

    private String name;
    private static final Scanner KEYBOARD = new Scanner(System.in);

    public Human(String name) {
        this.name = name;
    }
    @Override
    public int move(int numSticks) {
        numSticks = getInputFromKeyboard();
        while(numSticks < 1 || numSticks > 3) {
            System.out.println("Please enter a number between 1 and 3.");
            numSticks = getInputFromKeyboard();
        }
        return numSticks;
    }

    private int getInputFromKeyboard() {
        System.out.print(name + " How many sticks do you take (1-3)?");
        return KEYBOARD.nextInt();
    }

    @Override
    public void startGame() {
        System.out.println(name + ": Good Luck!");

    }

    @Override
    public void endGame(boolean win) {
        String result = win ? "Win" : "Lose";
        System.out.println(name + ": You " + result);

    }
}
