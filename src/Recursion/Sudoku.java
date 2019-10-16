package Recursion;

import java.util.Arrays;
import java.util.Optional;

public class Sudoku {

    int [][] values = new int[9][9];

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
                values[row][col] = v[row][col];
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
    }

    private boolean checkCol(int col, int value) {
    }

    private boolean checkBox(int row, int col, int value) {
    }

    public boolean place(int row, int col, int value) {
    }

    public boolean canPlace(int row, int col, int value) {
    }

    public static Sudoku copyBoard(Sudoku s) {
        Sudoku newBoard = new Sudoku(s.values);
        return newBoard;
    }

    public boolean isSolved() {
    }

    public static Optional<Sudoku> solve(Sudoku s) {



    }

    public static void main(String[] args) {
        int[][] board = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };

        Sudoku s = new Sudoku(board);
        System.out.println(s);
        Sudoku r = solve(s).get();
        System.out.println(r);

    }
}
