package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
        String reverse = reverseString(string);
        return string.equals(reverse);
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
