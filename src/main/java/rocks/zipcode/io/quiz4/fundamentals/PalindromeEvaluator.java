package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] allP = StringEvaluator.getAllSubstrings(string);
        List<String> list = new ArrayList<>();
        for(String str : allP)
            if (isPalindrome((str))) {
                list.add(str);
            }
        //list.add(getAllPalindromes(string).toString());

        return list.toArray(new String[list.size()]);
    }
        /*
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = string.length(); j > i; j--) {
                if(isPalindrome(string.substring(i, j))) {
                    if (!arrayList.contains(string.substring(i, j))) {
                        arrayList.add(string.substring(i, j));
                    }
                }
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }


         */
    public static Boolean isPalindrome(String string) {
        String reversed = reverseString(string);
        return reversed.equals(string);
    }


    public static String reverseString(String string) {
        StringBuilder reversedString = new StringBuilder(string);
        return reversedString.reverse().toString();

    }
}




