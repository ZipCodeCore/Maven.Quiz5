package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        Set<String> list = new HashSet<>();
        for(int i = 0; i < string.length(); i++) {
            for(int j = i +1; j<= string.length(); j++) {
                list.add(string.substring(i, j));

            }
        }
        return list.toArray(new String[list.size()]);

    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        getAllSubstrings(string2);
        getAllSubstrings(string1);
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
