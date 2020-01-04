package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> substrList = new ArrayList<String>();


        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                substrList.add(string.substring(i, j));
            }
        }

        ArrayList<String> newList = new ArrayList<String>();
        for (String element : substrList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        String[] arr = newList.toArray(new String[0]);


        List<String> paliList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                paliList.add(arr[i]);

            }
        }


        String[] paliArr = paliList.toArray(new String[0]);


        return paliArr;
    }

    public static Boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder(string);
        String rev = sb.reverse().toString();
        if (rev.equals(string)) {
            return true;
        }

        return false;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        String rev = sb.reverse().toString();
        return rev;
    }
}
