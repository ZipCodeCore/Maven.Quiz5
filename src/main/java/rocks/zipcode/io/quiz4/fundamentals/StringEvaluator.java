package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> pals = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                pals.add(string.substring(i, j));
            }
        }
        String[] output = new String[pals.size()];
        for (int i = 0; i < pals.size(); i++) {
            output[i] = pals.get(i);
        }
        return output;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
