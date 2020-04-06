package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {

    public static String[] getAllPalindromes(String string) {
        List<String> result = new ArrayList();
        String[] substrings = StringEvaluator.getAllSubstrings(string);

        for (String s : substrings) {
            if (reverseString(s).equals(s)) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }

    public static Boolean isPalindrome (String string){
        return string.equals(reverseString(string));
    }

    public static String reverseString (String string){
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}


