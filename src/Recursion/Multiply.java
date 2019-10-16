package Recursion;

public class Multiply {

    public static int multiply(int a, int b) {
        if(a == 0) {
            return 0;
        }
        if(a %2 == 0) {
            return multiply(a/2, b + b);
        }
        else {
            return multiply(a/2, b + b) + b;
        }
    }


    public static void main(String[] args){
        System.out.println(multiply(8,3));

    }
}
