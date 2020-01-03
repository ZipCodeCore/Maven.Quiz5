package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> result = new HashSet<>();
        for(int i=0;i<=string.length();i++){
            for(int j=i;j<string.length();j++){
                if(isPalindrome(string.substring(i,j+1))){
                    result.add(string.substring(i,j+1));
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        for(int i=0;i<=string.length()/2;i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String string) {
        String result= "";
        for (int i = string.length() - 1; i >= 0; i--){
            result += string.charAt(i);
        }
        return result;
    }
}
