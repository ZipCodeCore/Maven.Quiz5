package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] allSubstrings = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> allPalindromes = new ArrayList<>();
        for (int i = 0; i < allSubstrings.length; i++) {
            if(isPalindrome(allSubstrings[i]))
                allPalindromes.add(allSubstrings[i]);
        }
        return allPalindromes.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        return sb.reverse().toString();
    }
}
