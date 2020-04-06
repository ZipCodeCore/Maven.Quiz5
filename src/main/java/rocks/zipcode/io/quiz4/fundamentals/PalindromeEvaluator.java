package rocks.zipcode.io.quiz4.fundamentals;


import java.util.ArrayList;


/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        String[] subStrings = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> palindromes = new ArrayList<>();

        for(int i = 0; i < subStrings.length; i++) {
                if(isPalindrome(subStrings[i])) {
                    palindromes.add(subStrings[i]);
                }
            }
        String[] palindromeSubStrings = new String[palindromes.size()];
        palindromeSubStrings = palindromes.toArray(palindromeSubStrings);

        return palindromeSubStrings;

    }

    public static Boolean isPalindrome(String string) {

        String reverse = new StringBuilder(string).reverse().toString();

        return string.equals(reverse);

    }



    public static String reverseString(String string) {

        String result = new StringBuilder(string).reverse().toString();

        return result;
    }
}
