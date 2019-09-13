package lab1;

import static java.lang.Math.sqrt;

public class Sieve {

    private final int n;

    public Sieve(int n) {
        this.n = n;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int upper = 100;
        int[] inPlaceArray = new int[upper];
        int[] array = new int[upper];
        for (int i = 1; i < upper; i++) {
            inPlaceArray[i] = i;
            array[i] = i;
        }
        for (int j = 2; j < sqrt(upper); j++) {
            Sieve s = new Sieve(j);
            array = s.removeMultiplesNewArray(array);
            s.removeMultiplesInPlace(inPlaceArray);
        }
        printArray(array);
        printArray(inPlaceArray);

    }

    /**
     * Modifies array in place, replacing all multiples of n (other than n)
     * with 0 and shifting them to the end of the array.
     * <p>
     * n = 2
     * {1 2 3 4 5 6 7} -> {1 2 3 5 7 0 0}
     *
     * @param array
     * @return
     */
    public void removeMultiplesInPlace(int[] array) {

    }

    /**
     * Returns a new array that consists of the value of array with the multiples of n removed
     * <p>
     * n = 2
     * {1 2 3 4 5 6 7} -> {1 2 3 5 7}
     *
     * @param array
     * @return
     */
    public int[] removeMultiplesNewArray(int[] array) {
        return null;
    }
}
