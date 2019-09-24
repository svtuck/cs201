package lab1;// delete this line if this is not in a folder called lab1

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

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
    public static int[][] readMatrixFromFilename(String filename) throws IOException {
        "goo".charAt(1);
        File f = new File(filename);

        // Read file into List of strings
        //Files.readAllLines(f.toPath());

        Scanner scanner = new Scanner(f);

        int numberOfLines = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            numberOfLines = numberOfLines + 1;
        }
        System.out.println(numberOfLines);
        // Determine size of array, create int[][]
        int [][] matrix = new int[numberOfLines][numberOfLines];

        Scanner contentScanner = new Scanner(f);

        for(int i = 0; i < numberOfLines; i++) {
            for(int j = 0; j < numberOfLines; j++) {
                matrix[i][j] = contentScanner.nextInt();
            }
        }

        // Turn each string into an array of ints
        return matrix;
    }

    public static void main(String[] args) throws IOException {


        int [][] m = {{1,2,3},{4,5,6},{7,8,9}};


        String filename = "text/lab1/matrix2";

        int[][] matrix = readMatrixFromFilename(filename);

        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }
}
