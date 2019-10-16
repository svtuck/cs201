package Recursion;

import java.util.Arrays;
import java.util.Optional;

public class Sudoku {

    int [][] values = new int[9][9];

    int count = 0;

    public Sudoku() {
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                values[row][col] = 0;

            }
        }
    }

    public Sudoku(int[][] v) {
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                if(v[row][col] > 0) {
                    place(row, col, v[row][col]);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int row = 0; row < 9; row++) {
            sb.append(Arrays.toString(values[row]));
            sb.append("\n");
        }

        return sb.toString();
    }

    private boolean checkRow(int row, int value) {
        for(int col = 0; col< 9; col++) {
            if(values[row][col] == value) {
                return false;
            }
        }
        return true;
    }

    private boolean checkCol(int col, int value) {
        for(int row = 0; row< 9; row++) {
            if(values[row][col] == value) {
                return false;
            }
        }
        return true;
    }

    private boolean checkBox(int row, int col, int value) {




    }

    public void place(int row, int col, int value) {
        values[row][col] = value;
        count++;
    }

    public boolean canPlace(int row, int col, int value) {
        return checkBox(row, col, value) && checkRow(row, value) && checkCol( col, value);
    }

    public static Sudoku copyBoard(Sudoku s) {
        Sudoku newBoard = new Sudoku(s.values);
        return newBoard;
    }

    public boolean isSolved() {
    }



    public static Optional<Sudoku> solve(Sudoku s) {
        if(s.isSolved()) {

        }
        for(int row = 0; row < 9; row ++) {
            for(int col = 0; col < 9; col ++) {
            // Try to add a value, if you can't add a value return Optional.empty(), else return the board







            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };


        Sudoku s = new Sudoku(board);

        System.out.println(s);
        Optional<Sudoku> r = solve(s);
        System.out.println(r);

    }
}
