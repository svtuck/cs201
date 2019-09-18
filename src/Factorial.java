public class Factorial {


    public static int factorial(int n) {
        int result  = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        int result = factorial(n);
        System.out.println("the result is " + result);
    }
}
