package intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleScanner {

    public static void main(String[] args) throws FileNotFoundException {
        String n = "( + 1 12 15 )";
        Scanner s = new Scanner(n);
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
        System.out.println(s.next());
    }
}
