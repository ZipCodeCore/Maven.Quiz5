package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        HashSet<String> subs = new HashSet<>();
        for(int i = 0; i< string.length(); i++) {
            for (int j = 1; j<string.length(); j++) {
                subs.add(string.substring(i, j));
            }
        } subs.add(string);
        for (int i = 0; i<string.length(); i++)   {
            subs.add(string.substring(i,1));
        }
        String[] subsArr = new String[subs.size()];
        subsArr = subs.toArray(subsArr);
        return subsArr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
