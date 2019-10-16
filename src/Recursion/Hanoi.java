package Recursion;

public class Hanoi {

    public static int count = 0;
    public static void hanoi(int n) {
        hanoi(n, 1,3,2);

    }

    public static void hanoi(int n, int source, int dest, int temp) {
        count++;
        if(n == 1) {
            System.out.println(source + " --> " + dest);
        } else {
            hanoi(n-1, source, temp, dest);
            System.out.println(source + " --> " + dest);
            hanoi(n-1, temp, dest, source);
        }
    }

    public static void main(String[] args) {
        hanoi(8);
        System.out.println(count);
    }
}
