package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz4.fundamentals.StringEvaluator.getAllSubstrings;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> pals = new ArrayList<>();
        for(String s : getAllSubstrings(string)){
            if(isPalindrome(s))
                pals.add(s);
        }
        return pals.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
