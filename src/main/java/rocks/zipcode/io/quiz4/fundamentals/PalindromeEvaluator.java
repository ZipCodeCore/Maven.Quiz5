package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> listOfPalindromes = new ArrayList<>();
        for(int i =0 ; i < string.length(); i++){
            for(int j =i+1 ; j < string.length()+1; j++){
                String current = string.substring(i,j);
                if(isPalindrome(current) && !listOfPalindromes.contains(current)){
                    listOfPalindromes.add(current);
                }
            }
        }
        return listOfPalindromes.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return(string.equals(reverseString(string)));
    }

    public static String reverseString(String string){ StringBuilder sb = new StringBuilder(string);
    return sb.reverse().toString();}
}
