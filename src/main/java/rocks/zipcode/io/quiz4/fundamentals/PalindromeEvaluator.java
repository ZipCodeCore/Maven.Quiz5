package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
        return null;
    }

    public static String reverseString(String string) {
        String output = "";
        for (int i = string.length() - 1; i >= 0; i--){
            output = output + string.charAt(i);
        }
        return output;
    }
}
