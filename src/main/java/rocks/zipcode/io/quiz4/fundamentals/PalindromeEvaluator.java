package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

    List<String> palindromes = new ArrayList<>();
    int counter = 0;
        for (int i = 0; i < string.length(); i++) {
        for (int j = i + 1; j <= string.length(); j++) {
            if (isPalindrome(string.substring(i, j))) {
                palindromes.add(string.substring(i, j));
                //System.out.println(input.substring(i, j));
                palindromes.add(string.substring(i,j));
            }
        }
    }
        return palindromes.toArray(new String[palindromes.size()]);
}

    public static Boolean isPalindrome(String string) {
        // Pointers now are pointing to the beginning of the string and the end of the string
        int i = 0, j = string.length() - 1;

        //while there are chars to compare
        while (i < j) {

            // If they don't match
            if (string.charAt(i) != string.charAt(j))
                return false;

            // Increment first pointer(i) and decrement the second pointer(2)
            i++;
            j--;
        }
        //string is a palindrome
        return true;
    }
    //other method
    // String reversed = reverseString(string);
    //        return reversed.equals(string);


    public static String reverseString(String string) {
        String a = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            a = a + string.charAt(i);

        }
        return a;
    }

        /*
        StringBuilder reversedString = new StringBuilder(string);
        return reversedString.reverse().toString();
         */

    }





