package lab1;

public class DiagonalTest {

    public static int diagonalDifference(int[][] matrix) {

        return 0;
    }

    public static void test(int n, int expected, int found) {

        if(expected == found) {
            System.out.println("Case " + n + " succeeded");
        }
        else {
            System.out.println("Case " + n + " failed");
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


        test(1,0, diagonalDifference(matrix));



    }
}
