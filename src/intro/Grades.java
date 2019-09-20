package intro;

import java.util.*;

public class Grades {
    public static void main(String[] args) {

        int[] grades = {88, 90, 95, 80};
        int first = grades[0];

        int numGrades = grades.length;
        int last = grades[numGrades-1];

        System.out.println(grades[2]);
        System.out.println(grades[3]);
        grades[2] = 100;
        grades[3] *= .9;

        System.out.println(Arrays.toString(grades));

        // Create an array from 0 to 10
        int [] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < 10; i++) {
            numbers[i] = 5 * i;
        }
        System.out.println(Arrays.toString(numbers));




    }
}
