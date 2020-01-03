package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {


    public static String[] getAllPalindromes(String string) {
        String[] strings = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> strings2 = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (isPalindrome(strings[i])) {
                strings2.add(strings[i]);
            }
        }
        return strings2.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.length()==1){
                return true;
            }else if (string.charAt(i) != string.charAt(string.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String string) {
        StringBuilder revString = new StringBuilder();
        for (int i = string.length() - 1; i <= 0; i--) {
            revString.append(string.charAt(i));
        }
        return revString.toString();
    }
}

