package lab1;

import java.io.IOException;

public class Diagonal {

    /**
     * Returns the absolute value of the difference between the diagonals of a matrix.
     * <p>
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * <p>
     * Should return abs((1+5+9) - (3+5+7)) = 0
     */
    public static int diagonalDifference(int[][] matrix) {
        return 0;
    }

    /**
     * Reads a file and returns an array of arrays of ints
     *
     * @param filename
     * @return
     */
    public static int[][] readMatrixFromFilename(String filename) {
        // Read file into List of strings

        // Determine size of array, create int[][]

        // Turn each string into an array of ints
        return null;
    }

    public static void main(String[] args) throws IOException {
        String filename = args[0];
        int[][] matrix = readMatrixFromFilename(filename);
        int diff = diagonalDifference(matrix);
        // Print difference

    }
}
