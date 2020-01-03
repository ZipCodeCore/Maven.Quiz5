package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> finalArray = new ArrayList<>();
        String [] result = StringEvaluator.getAllSubstrings(string);
        for (String each : result){
            if (isPalindrome(each)) finalArray.add(each);
        }

        String [] temp = new String[finalArray.size()];

        return finalArray.toArray(temp);
    }

    public static Boolean isPalindrome(String string) {
        String reversed = reverseString(string);

        return string.equals(reversed);
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
