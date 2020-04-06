package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int k = string.length(); k > i; k--) {
                if(isPalindrome(string.substring(i, k))) {
                    if (!arrayList.contains(string.substring(i, k))) {
                        arrayList.add(string.substring(i, k));
                    }
                }
            }
        }
        return arrayList.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        String reverse = reverseString(string);
        return reverse.equals(string);
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }
}
