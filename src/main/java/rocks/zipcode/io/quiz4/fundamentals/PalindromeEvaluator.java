package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        StringEvaluator evaluator = new StringEvaluator();
        String[] allSubstrings = evaluator.getAllSubstrings(string);

        ArrayList<String> palindromeList = new ArrayList<>();
        for(String s: allSubstrings)
            if(isPalindrome(s) && !palindromeList.contains(s)){
                palindromeList.add(s);
            }

        return palindromeList.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--){
            sb.append(string.charAt(i));
        }

        return sb.toString();
    }
}
