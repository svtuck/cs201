package SetsMaps;

import java.util.HashMap;
import java.util.Map;

public class CacheExample {


    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1) % 100000;
        }
    }

    public static void main (String[] args) {
        int n = 39690;
        long start = System.nanoTime();
        for(int i = 2; i < n; i ++) {
            cachedFactorial(i);
        }
        long end = System.nanoTime();
        System.out.println((end - start)/n/1e6);

    }






    static Map<Integer, Integer> cache = new HashMap<>();

    public static int cachedFactorial(int n) {
        if(cache.containsKey(n)) {
            return cache.get(n);
        }
        if(n == 1) {
            return 1;
        }
        else {
            int answer = n * cachedFactorial(n-1) % 100000;
            cache.put(n, answer);
            return answer;
        }
    }
}
