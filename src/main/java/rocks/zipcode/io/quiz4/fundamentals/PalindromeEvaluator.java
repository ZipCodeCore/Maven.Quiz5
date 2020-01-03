package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> palindromeList = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i+1; j <= string.length(); j++){
                if(isPalindrome(string.substring(i,j)) && !palindromeList.contains(string.substring(i,j))){
                    palindromeList.add(string.substring(i,j));
                }
            }
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
