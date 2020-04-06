package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
        String reverse = reverseString(string);
        return reverse.equals(string);
    }

    public static String reverseString(String string) {
        StringBuilder plain = new StringBuilder(string);
        StringBuilder reverse = plain.reverse();
        return reverse.toString();
    }
}
