public class Primes {


    public static boolean isNumberPrime(int myNumber) {
        boolean isPrime = true;
        for(int i=2; i < myNumber; i++ ) {
            if(myNumber % i == 0 ) {
                isPrime = false;
                System.out.println(i + " is a factor of " + myNumber);
            }
            else {
                System.out.println(i + " is not a factor of " + myNumber);
            }

        }
        return isPrime;

    }


    public static void main(String [] args) {

        int myNumber = 11;


        boolean isPrime = isNumberPrime(myNumber);
        if(isPrime == true) {
            System.out.println(myNumber + " is prime");
        } else {
            System.out.println(myNumber + " is not prime");
        }
    }
}
