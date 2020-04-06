package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] newArray = StringEvaluator.getAllSubstrings(string);
        List<String> outputArray = new ArrayList<>();
        for(String a : newArray){
            if(isPalindrome(a)){
                outputArray.add(a);
            }
        }
        String[] outputArray3 = outputArray.toArray(new String[outputArray.size()]);
        return outputArray3;
    }

    public static Boolean isPalindrome(String string) {

        return string.equals(PalindromeEvaluator.reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder outputString = new StringBuilder();
        outputString.append(string);
        return outputString.reverse().toString();
    }
}
