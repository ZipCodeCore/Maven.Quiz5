package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> subStrings = new TreeSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                subStrings.add(string.substring(i, j));
            }
        }
        return subStrings.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> str1 = new TreeSet<>(Arrays.asList(getAllSubstrings(string1)));
        Set<String> str2 = new TreeSet<>(Arrays.asList(getAllSubstrings(string2)));
        ArrayList<String> output = new ArrayList<>();
        for (String string : str1) {
            if (str2.contains(string)) output.add(string);
        }
        return output.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();
        int max = 0;
        int[][] dp = new int[a][b];
        int endIndex = -1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if (max < dp[i][j]) {
                        max = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return str1.substring(endIndex - max + 1, endIndex + 1);
    }
}
