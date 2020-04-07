package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

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
        return list.toArray(new String[list.size()]);

    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        List<String> commonSubs = new ArrayList<>();
        for (String st : getAllSubstrings(string1)) {
            if (Arrays.asList(getAllSubstrings(string2)).contains(st)) {
                commonSubs.add(st);
            }
        }
        return commonSubs.toArray(new String[commonSubs.size()]);

    }


    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        String result = "";
        for (String substr : commonSubstrings) {
            if (result.length() < substr.length()) {
                result = substr;
            }
        }
        return result;
    }
}