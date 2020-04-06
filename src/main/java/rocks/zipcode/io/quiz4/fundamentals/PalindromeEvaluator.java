package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
        int tail = string.length()-1;

        for(char c: string.toCharArray()){
            if(c != string.charAt(tail))
                return false;
            tail--;
        }
        return true;
    }

    public static String reverseString(String string) {
        char[] c = string.toCharArray();
        int tail = string.length()-1;
        for (int i = 0; i < string.length()/2 ; i++) {
            char temp = ' ';
            temp = c[i];
            c[i] = c[tail];
            c[tail] = temp;
        }
        return Arrays.toString(c);
    }


}
