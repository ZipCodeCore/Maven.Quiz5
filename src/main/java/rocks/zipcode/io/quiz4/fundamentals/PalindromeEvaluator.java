package rocks.zipcode.io.quiz4.fundamentals;

import java.util.stream.Stream;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] subs = StringEvaluator.getAllSubstrings(string);
         return Stream.of(subs).filter(PalindromeEvaluator::isPalindrome).toArray(String[]::new);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder();
        for(int i = string.length()-1; i >= 0 ; i--) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }
}
