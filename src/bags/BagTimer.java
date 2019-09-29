package bags;

import java.util.Arrays;

public class BagTimer {

    /*
    Returns the time it takes to add to the bag
     */
    public static long timeAdd(Bag b, String s) {
        long start = System.nanoTime();
        b.add(s);
        long end = System.nanoTime();
        return end - start;
    }

    public static void timeMe(Bag b, int n) {

        long[] times = new long[n];
        for(int i = 0; i < n; i++ ) {
            times[i] = timeAdd(b, "foo");
        }
        long total = 0;
        long max = 0;
        for(int i = 0; i < times.length; i++) {
            total += times[i];
            if(times[i] > max) {
                max = times[i];
            }
            System.out.println(i + " " + times[i]);
        }
        System.out.println("The total time was: " + total + " nanoseconds with an average per addition of " + total/n + " and a maximimum of " + max);



    }

}
