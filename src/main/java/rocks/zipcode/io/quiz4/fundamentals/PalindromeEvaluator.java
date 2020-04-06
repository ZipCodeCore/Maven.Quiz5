package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        int count = 0;
        List<String> arrList = new ArrayList<>();
        for (int i = 0; i <= string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (isPalindrome(string.substring(i, j + 1))) {
                    arrList.add(string.substring(i, j + 1));
                    count++;
                    System.out.println(string.substring(i, j + 1));
                }
            }
        }
        String[] arr = new String[count];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arrList.get(i);
        }
        return arr;
    }

    public static Boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String reverseString(String string) {
        StringBuilder reversed = new StringBuilder();
        reversed.append(string);
        reversed.reverse();
        return reversed.toString();
    }
}
