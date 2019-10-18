package SetsMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample {


    public static Map<String, Integer> wordCounter = new HashMap<>();
    public static int largest;

    public static String clean(String word) {
        word = word.replaceAll("[^a-zA-Z]", "");
        word = word.toLowerCase();
        return word;
    }




    public static void main(String[] args) throws FileNotFoundException {


        Scanner s = new Scanner(new File("text/taleoftwocities.txt"));

        while(s.hasNext()){
            String word = clean(s.next());
            if(word.length() > 1 || word.equals("a") || word.equals("i")) {
                if (!wordCounter.containsKey(word)) {
                    wordCounter.put(word, 1);
                } else {
                    wordCounter.put(word, wordCounter.get(word) + 1);
                }
            }
        }

        // To iterate through a map, we use this (odd) syntax
        for(Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        String a = "thefrenchmanfrenchmanfrenchmanfrenchmanfrenchmanfrenchmanfrenchmanfrenchmanwalkedtowardsthescaffold"; // the frenchman walked towards the scaffold

        largest = 10;




        doChunking(a);



    }

    static int chunkCount = 0;
    public static Map<String, Integer> chunk(String s) {
        chunkCount++;

        // Start with an empty map
        Map<String, Integer> decoded = new HashMap<>();
        StringBuilder start = new StringBuilder();

        for (int i = 0; i < largest && i < s.length(); i++) {
            // Keep track of the start of the string
            start.append(s.charAt(i));

            // If the start is a word we've seen...
            if (wordCounter.containsKey(start.toString())) {

                String left = start.toString();
                Integer leftCount = wordCounter.get(left);
                if(i+1 == s.length()) {
                    // If it is the end of the string, add the "start" to my map
                    decoded.put(left, leftCount);
                }
                else {
                    // Otherwise, chunk everything to the right
                    String right = s.substring(i+1);

                    Map<String, Integer> rightDecoded = chunk(right);
                    // Add every valid chunking to the map I'm returning
                    for(Map.Entry<String, Integer> entry : rightDecoded.entrySet()) {
                        decoded.put(left + " " + entry.getKey(), leftCount + entry.getValue());
                    }
                }
            }
        }
        return decoded;
    }

    public static void doChunking(String a) {







        String best = "";
        int bestCount = 0;
        Map<String, Integer> chunked = chunk(a);
        for(Map.Entry<String, Integer> c : chunked.entrySet()) {
            System.out.println(c.getKey() + " " + c.getValue());
            if(c.getValue() > bestCount) {
                bestCount = c.getValue();
                best = c.getKey();
            }
        }

        System.out.println("Best guess: " + best);
        System.out.println("Count was: " + chunkCount);

        chunkCached(a);
        System.out.println("Cached count was: " + cacheCount);

    }







    //< Input, Output>
    public static Map<String, Map<String, Integer>> cache = new HashMap<>();
    static int cacheCount = 0;
    public static Map<String, Integer> chunkCached(String s) {
        System.out.println("Chunking " + s);
        cacheCount++;

        if(cache.containsKey(s)) {
            System.out.println("Using cached answer for: " + s);
            return cache.get(s);
        }


        Map<String, Integer> decoded = new HashMap<>();
        StringBuilder start = new StringBuilder();
        for (int i = 0; i < largest && i < s.length(); i++) {
            start.append(s.charAt(i));
            if (wordCounter.containsKey(start.toString())) {
                String left = start.toString();
                Integer leftCount = wordCounter.get(left);
                if(i+1 == s.length()) {
                    decoded.put(left, leftCount);
                }
                else {
                    String right = s.substring(i+1);
                    System.out.println("Left is " + left + " right is " + right);
                    Map<String, Integer> rightDecoded = chunkCached(right);
                    for(Map.Entry<String, Integer> entry : rightDecoded.entrySet()) {
                        decoded.put(left + " " + entry.getKey(), leftCount + entry.getValue());
                    }
                }
            }
        }
        cache.put(s, decoded);
        return decoded;
    }
}
