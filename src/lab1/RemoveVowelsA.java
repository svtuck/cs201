package lab1;

import java.util.Arrays;

public class RemoveVowelsA {


    /**
     * Modifies 's' removing 'a', 'e', 'i', 'o', 'u'
     *
     * @param s an array
     * @return
     */
    public static void removeVowels(char[] s){ }


    /**
     * Returns s as an array of chars
     *
     * @param s
     * @return
     */
    public static char[] stringToChar(String s) {return null;}

    public static void main(String[] args) {
        String input = "the quick brown fox jumped over the lazy dog";

        char[] inputArray = stringToChar(input);

        removeVowels(inputArray);

        System.out.println(Arrays.toString(inputArray));
    }
}
