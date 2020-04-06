package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

import static rocks.zipcode.io.quiz4.fundamentals.StringEvaluator.getAllSubstrings;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] subs = getAllSubstrings(string);
        ArrayList<String> pals = new ArrayList<>();
        for (String sub : subs) {
            if (isPalindrome(sub)){
                pals.add(sub);
            }
        }
        String[] palindromes = new String[pals.size()];
        pals.toArray(palindromes);
        return palindromes;
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
