package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {

        return string.equals(PalindromeEvaluator.reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder outputString = new StringBuilder();
        outputString.append(string);
        return outputString.reverse().toString();
    }
}
