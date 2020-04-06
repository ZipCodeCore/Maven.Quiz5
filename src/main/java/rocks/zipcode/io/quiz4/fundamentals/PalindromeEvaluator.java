package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        StringEvaluator ev = new StringEvaluator();

        String [] allSubs= StringEvaluator.getAllSubstrings(string);

        ArrayList<String> list = new ArrayList<String>();
        for(String s: allSubs)
            if(isPalindrome(s) && !list.contains(s)){
                list.add(s);
            }

        return list.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        String reverseString = reverseString(string);

        return string.equals(reverseString);
    }

    public static String reverseString(String string) {
        String reverseString = new StringBuilder(string).reverse().toString();
        return reverseString;
    }
}
