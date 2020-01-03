package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> allPalin = new ArrayList<>();
        return null;
    }

    public static Boolean isPalindrome(String string) {
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j))
                return false;

            i++;
            j++;
            return true;
        }
        return null;
    }

    public static String reverseString(String string) {
        char[] reversedString = string.toCharArray();
        int start = 0;
        int end = reversedString.length - 1;
        char temp;

        while (end > start) {
            temp = reversedString[start];
            reversedString[start] = reversedString[end];
            reversedString[end] = temp;
            end--;
            start++;
        }
        return new String(reversedString);
    }
}
