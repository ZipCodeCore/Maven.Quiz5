package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] a = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> list = new ArrayList<>();
        for(String s :a){
            if(isPalindrome(s))
                list.add(s);
        }
        return list.toArray(new String[0]);
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
            tail--;
        }
        return String.valueOf(c);
    }


}
