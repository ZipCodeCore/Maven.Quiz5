package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {


    public static String[] getAllPalindromes(String string) {
        String[] subsArr = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < subsArr.length; i++) {
            if (isPalindrome(subsArr[i])) {
                resultList.add(subsArr[i]);
            }
        } String[] resultArr = new String[resultList.size()];
        resultArr = resultList.toArray(resultArr);

        return resultArr;
    }



    public static Boolean isPalindrome(String string) {

        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result.equals(string);
    }

    public static String reverseString(String string) {

        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }
}
