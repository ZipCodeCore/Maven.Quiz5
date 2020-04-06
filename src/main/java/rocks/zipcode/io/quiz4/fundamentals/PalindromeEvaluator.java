package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] allP = StringEvaluator.getAllSubstrings(string);
        List<String> list = new ArrayList<>();
        for(String str : allP)
            if (isPalindrome((str))) {
                list.add(str);
            }
        //list.add(getAllPalindromes(string).toString());

    return list.toArray(new String[list.size()]);
    }

    public static Boolean isPalindrome(String string) {
        int count = string.length() - 1;
        for (char ch : string.toCharArray()) {
            if (ch != string.charAt(count)) {
                return false;
            }
            count--;

        }
        return true;
    }

    public static String reverseString(String string) {
        StringBuilder reversedString = new StringBuilder(string);
        return reversedString.reverse().toString();

    }
}




