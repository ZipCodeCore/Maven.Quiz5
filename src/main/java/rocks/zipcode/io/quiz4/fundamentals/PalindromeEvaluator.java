package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {

    public static String[] getAllPalindromes(String string) {

        Set<String> result = new HashSet<String>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                StringBuilder sb = new StringBuilder(string.substring(i, j));
                if (string.substring(i, j).equals(sb.reverse().toString())) {
                    result.add(string.substring(i, j));
                }
            }
        }

        String[] toReturn = new String[result.size()];
        return result.toArray(toReturn);
    }

    public static Boolean isPalindrome(String string) {

        StringBuilder sb = new StringBuilder(string);
        return string.equals(sb.reverse().toString());
    }

    public static String reverseString(String string) {

        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();

    }
}
