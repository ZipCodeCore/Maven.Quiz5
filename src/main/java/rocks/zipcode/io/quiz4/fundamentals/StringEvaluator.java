package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> arrList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            for (int j = i + 1; j < string.length() + 1; j++){
                if (!arrList.contains((string.substring(i, j)))) {
                    arrList.add(string.substring(i, j));
                }
            }
        }
        return arrList.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        int[][] table = new int[string1.length()][string2.length()];
        int longest = 0;
        Set<String> result = new HashSet<>();

        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) != string2.charAt(j)) {
                    continue;
                }

                table[i][j] = (i == 0 || j == 0) ? 1
                        : 1 + table[i - 1][j - 1];
                if (table[i][j] > longest) {
                    longest = table[i][j];
                    result.clear();
                }
                if (table[i][j] == longest) {
                    result.add(string1.substring(i - longest + 1, i + 1));
                }
            }
        }
        return result.toString().replace("[", "").replace("]", "");
    }
}
