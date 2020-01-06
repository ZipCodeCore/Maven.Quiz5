package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] substr = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> palin = new ArrayList<>();
        for (String eval: substr) {
            if (isPalindrome(eval))
                palin.add(eval);
        }
        return palin.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        String newStr = "";
        for (int i = 0; i < string.length(); i++) {
            newStr += string.charAt(string.length()-i-1);
        }
        return newStr;
    }
}
