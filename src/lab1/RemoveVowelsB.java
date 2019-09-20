package lab1;

import java.util.Arrays;

public class RemoveVowelsB {


    /**
     * Returns a new array that is a copy of s with vowels removed.
     * The new array should have no empty characters (it should be smaller in length than s).
     *
     *
     * {'t', 'h', 'e', ' ', 'd', 'o', 'g'} -> {'t', 'h',  ' ', 'd', 'g'}
     *
     *
     * @param s an array
     * @return a new array
     */
    public static char[] removeVowels(char[] s){return null;}


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

        char[] outputArray = removeVowels(inputArray);

        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(outputArray));
    }
}
