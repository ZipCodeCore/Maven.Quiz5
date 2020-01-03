package rocks.zipcode.io.quiz4.fundamentals;

import rocks.zipcode.io.quiz4.collections.SimpleStringGroup;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] arr = StringEvaluator.getAllSubstrings(string);
        SimpleStringGroup group = new SimpleStringGroup();
        for (String str : arr) {
            if (isPalindrome(str)) group.insert(str);
        }
        return group.getArr();
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
}
