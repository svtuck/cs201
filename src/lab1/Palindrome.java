package lab1;

public class Palindrome {

    /**
     * Returns true if 's' reads the same forwards and back (with spaces removed)
     *
     * @param s a string
     * @return true if s is a palindrome
     */
    public static boolean isPalindrome(String s) {
        return false;
    }

    public static void printResult(boolean a) {
        if (a) {
            System.out.println("Yes this is a palindrome");
        } else {
            System.out.println("No this is not a palindrome");
        }
    }

    public static void main(String[] args) {
        String s = "a man a plan a canal panama";
        boolean a = isPalindrome(s);
        printResult(a);
        String t = "racecars";
        boolean b = isPalindrome(t);
        printResult(b);
    }
}
