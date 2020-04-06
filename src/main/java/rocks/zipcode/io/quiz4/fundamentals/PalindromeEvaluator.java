package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] allSubstrings =StringEvaluator.getAllSubstrings(string);
        ArrayList<String> palindromeList = new ArrayList<>();
        for( String substring : allSubstrings){
            if( isPalindrome(substring)){
                palindromeList.add(substring);
            }
        }
        return palindromeList.toArray(new String[palindromeList.size()]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
       StringBuilder str= new StringBuilder(string);
       return str.reverse().toString();
    }
}
