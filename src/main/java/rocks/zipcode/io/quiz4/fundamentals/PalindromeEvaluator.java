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
            for (int j = i + 1; j <= string.length(); j++) {
                if (isPalindrome(string.substring(i, j))) {
                    palindromes.add(string.substring(i, j));
                }
            }
        }
        String[] strArr = new String[palindromes.size()];
        int index = 0;
        for (String str : palindromes) {
            strArr[index++] = str;
        }
        return strArr;
    }

    public static Boolean isPalindrome(String string) {
        String str = reverseString(string);
        if(str.compareTo(string) == 0) {
            return true;
        } else
            return false;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder().append(string);
        sb.reverse();
        return sb.toString();
    }
}
