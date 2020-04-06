package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz4.fundamentals.StringEvaluator.getAllSubstrings;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> palindrome = new ArrayList<>();
        for(String s : getAllSubstrings(string)){
            if(isPalindrome(s))
                palindrome.add(s);
        }
        return palindrome.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder str= new StringBuilder(string);
        return str.reverse().toString();
    }
}
