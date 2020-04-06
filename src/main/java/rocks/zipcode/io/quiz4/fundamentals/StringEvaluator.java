package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {

    public static String[] getAllSubstrings(String string) {
        Set<String> subs = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                subs.add(string.substring(i, j));
            }
        }
//        Object[] result = subs.toArray();
//        String[] answer = Arrays.copyOf(result,);
        return null;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
