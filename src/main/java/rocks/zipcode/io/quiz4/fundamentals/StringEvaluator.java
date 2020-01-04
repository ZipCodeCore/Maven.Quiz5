package rocks.zipcode.io.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        List<String> substrList = new ArrayList<String>();


        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                substrList.add(string.substring(i, j));
            }
        }

        ArrayList<String> newList = new ArrayList<String>();
        for (String element : substrList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }


        String[] arr = newList.toArray(new String[0]);


        return arr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] arr1 = getAllSubstrings(string1);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));
        String[] arr2 = getAllSubstrings(string2);
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            if (list.contains(arr2[i])) {
                newList.add(arr2[i]);
            }
        }
        String[] arr = newList.toArray(new String[0]);
        return arr;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] arr = getCommonSubstrings(string1, string2);
        String largestCommon = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() >= largestCommon.length()) {
                largestCommon = arr[i];
            }
        }

        return largestCommon;
    }
}
