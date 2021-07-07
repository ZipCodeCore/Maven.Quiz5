package rocks.zipcode.io.quiz4.fundamentals;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> setOfStrings = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                setOfStrings.add(string.substring(i, j));
                System.out.println(string.substring(i, j));
            }
        }
        String[] arr = new String[setOfStrings.size()];
        arr = setOfStrings.toArray(arr);
        return arr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] arr1 = getAllSubstrings(string1);
        String[] arr2 = getAllSubstrings(string2);
        List<String> common = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    common.add(arr1[i]);
                }
            }
        }

        String[] arr = new String[common.size()];
        for (int i = 0; i < common.size(); i++) {
            arr[i] = common.get(i);
        }
        return arr;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        String winner = "";
        for (int i = 0; i < commonSubstrings.length - 1; i++) {
            int size = commonSubstrings[i].length();
            if (size > commonSubstrings[i + 1].length()) {
                winner = commonSubstrings[i];
            }
        }
        return winner;
    }
}
