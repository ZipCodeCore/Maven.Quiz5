package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> pals = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                pals.add(string.substring(i, j));
            }
        }
        String[] output = pals.toArray(new String[0]);
        return output;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        String[] subs1 = getAllSubstrings(string1);
        String[] subs2 = getAllSubstrings(string2);
        Set<String> out = new HashSet<>();
        ArrayList<String> subssA = new ArrayList<>();
        ArrayList<String> subssB = new ArrayList<>();
        for (String s : subs1) { subssA.add(s); }
        for (String s : subs2) { subssB.add(s); }
        for (String s : subssA) {
            if (subssB.contains(s)) {
                out.add(s);
            }
        }
        for (String s : subssB) {
            if (subssA.contains(s)) {
                out.add(s);
            }
        }
        String[] output = new String[out.size()];
        int index = 0; for (String s : out) { output[index++] = s; }
        return output;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        int m = string1.length();
        int n = string2.length();
        int[][] bigbrain = new int[m + 1][n + 1];
        int outputLength = 0;
        int row = 0, col = 0;
        for (int i = 0; i <= m; i++) {
            for (int k = 0; k <= n; k++) {
                if (i == 0 || k == 0)
                    bigbrain[i][k] = 0;

                else if (string1.charAt(i - 1) == string2.charAt(k - 1)) {
                    bigbrain[i][k] = bigbrain[i - 1][k - 1] + 1;
                    if (outputLength < bigbrain[i][k]) {
                        outputLength = bigbrain[i][k];
                        row = i;
                        col = k;
                    }
                }
                else
                    bigbrain[i][k] = 0;
            }
        }
        if (outputLength == 0) { return ""; }
        String resultStr = "";
        while (bigbrain[row][col] != 0) {
            resultStr = string1.charAt(row - 1) + resultStr;
            --outputLength;
            row--;
            col--;
        }

        return resultStr;
    }
}
