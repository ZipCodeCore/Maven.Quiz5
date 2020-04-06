package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> subs = new HashSet<>();
        Set<String> pals = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                subs.add(string.substring(i, j));
            }
        }
        for (String s : subs) {
            if (isPalindrome(s)) {
                pals.add(s);
            }
        }
        String[] output = new String[pals.size()];
        int i = 0;
        for (String s : pals) {
            output[i++] = s;
        }
        return output;
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        return new StringBuilder().append(string).reverse().toString();
    }
}
