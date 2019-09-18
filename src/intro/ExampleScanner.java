package intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleScanner {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        Scanner fileScanner = new Scanner(new File("text/lab1/matrix1"));
        System.out.println(fileScanner.nextInt());

    }
}
