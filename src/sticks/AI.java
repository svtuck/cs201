package sticks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AI implements Player {

    private String name;
    private boolean verbose;

    private static final int[][] HATS = initializeHats();
    private int[] choices;
    private static final Scanner KEYBOARD = new Scanner(System.in);


    public AI(String name) {
        this(name, true);
    }

    public AI(String name, boolean verbose) {
        this.name = name;
        this.choices = new int[SticksGame.MAX];
        this.verbose = verbose;
    }
    @Override
    public int move(int numSticks) {
        int totalHats = HATS[numSticks][0] + HATS[numSticks][1] + HATS[numSticks][2];
        int choice = new Random().nextInt(totalHats + 1);

        int move = 0;
        int hatsSoFar = HATS[numSticks][move];
        while(hatsSoFar <= choice) {
            hatsSoFar += HATS[numSticks][++move];
        }
        move = move + 1;
        choices[numSticks] = move;

        if(verbose) {
            System.out.println("Taking " + move + " stick(s)");
        }
        return move;
    }

    private static int[][] initializeHats() {
        int[][] hats = new int[SticksGame.MAX][3];
        for(int i = 0; i < hats.length; i++ ) {
            for(int j = 0 ; j < hats[0].length; j++) {
                hats[i][j] = 1;
            }
        }
        return hats;
    }

    @Override
    public void startGame() {
        if(verbose) {
            System.out.println(name + " says 'I, the AI, will hope to defeat you!'");
        }

    }

    public void display() {
        for(int i = 0; i < HATS.length; i++) {
            System.out.println(i + " " + Arrays.toString(HATS[i]));
        }
    }

    @Override
    public void endGame(boolean win) {
        for(int i = 0; i < choices.length; i++) {
            if(choices[i] > 0) {
                if(win) {
                    HATS[i][choices[i] - 1]++;
                } else {
                    HATS[i][choices[i] - 1]--;
                    HATS[i][choices[i] - 1] = Math.max(HATS[i][choices[i] - 1], 1);
                }

            }
        }

        String result = win ? "Win" : "Lose";
        if(verbose) {
            System.out.println(name + ": You " + result);
        }

    }
}
