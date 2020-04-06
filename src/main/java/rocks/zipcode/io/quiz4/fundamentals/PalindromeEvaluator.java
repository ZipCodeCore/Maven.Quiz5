package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {

    public static String[] getAllPalindromes(String string) {
        String[] allSubstrings = StringEvaluator.getAllSubstrings ( string );
        ArrayList<String> allPalindromes = new ArrayList<> (  );
        for ( int i = 0; i < string.length(); i++) {
                if (isPalindrome(allSubstrings[i])) {
                    allPalindromes.add ( allSubstrings[i] );
                }
            } return allPalindromes.toArray (new String[0] );
        }



    public static Boolean isPalindrome(String string) {
        StringBuilder revString = new StringBuilder();
        revString.append(string);

        return string.equals(revString.reverse().toString());
    }

    public static String reverseString(String string) {

        StringBuilder revString = new StringBuilder();
        revString.append(string);

        return revString.reverse().toString();
}
}
