package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> list = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                list.add(string.substring(i, j));
            }
        }
        String[] substrings = list.toArray(new String[list.size()]);
        return substrings;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String [] result = getAllSubstrings(string1);
        String [] result1 = getAllSubstrings(string2);
        List<String> list = new ArrayList<>();
        for (String a : result) {
            for (String b : result1) {
                if (a.equals(b)) {
                    list.add(a);
                }
            }
        }
        String[] commonSubstrings = list.toArray(new String[list.size()]);
        return commonSubstrings;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] lrgCommonSubstring = getCommonSubstrings(string1, string2);
        String result = "";
        for (String s : lrgCommonSubstring) {
            if (s.length() > result.length()) {
                result = s;
            }
        }
        return result;
    }
}


