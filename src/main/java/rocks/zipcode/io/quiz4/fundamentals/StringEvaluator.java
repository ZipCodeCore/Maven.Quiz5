package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> arrResults = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                arrResults.add(string.substring(i, j));
            }
        }
        HashSet<String> setResults = new HashSet<>(arrResults);
        return setResults.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] s1Substrings = getAllSubstrings(string1);
        String[] s2Substrings = getAllSubstrings(string2);
        ArrayList<String> results = new ArrayList<>(Arrays.asList(s1Substrings));
        results.retainAll(Arrays.asList(s2Substrings));
        return results.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubStrings = getCommonSubstrings(string1, string2);
        int max = 0;
        String longestString = commonSubStrings[0];
        for (int i = 0; i < commonSubStrings.length; i++) {
            if(commonSubStrings[i].length() > max) {
                longestString = commonSubStrings[i];
                max = commonSubStrings[i].length();
            }
        }
        return longestString;
    }
}
