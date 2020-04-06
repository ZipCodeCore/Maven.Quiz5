package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (isPalindrome(string)) {
                    palindromes.add(string);
                }
                if (isPalindrome(string.substring(i, j))) {
                    palindromes.add(string.substring(i, j));
                }
            }
        }
        String[] arr = new String[palindromes.size()];
        int i = 0;
        for (String element : palindromes) {
            arr[i++] = element;
        }
        return arr;
    }

    public static Boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String reverseString(String string) {
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        return reversed;
    }
}
