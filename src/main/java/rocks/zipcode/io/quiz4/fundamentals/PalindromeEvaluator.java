package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

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
        for (String str : palindromes)
            strArr[index++] = str;

        return strArr;
    }

    public static Boolean isPalindrome(String string) {
       String reverse = reverseString(string);
       if(string.equals(reverse)){
           return true;
       }
        return false;
    }

    public static String reverseString(String string) {
        StringBuilder str = new StringBuilder(string).reverse();
        return str.toString();
    }
}
