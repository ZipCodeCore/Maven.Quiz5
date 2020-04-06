package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

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




    public static String getLargestCommonSubstring(String string1, String string2) {
        String[]common = getCommonSubstrings(string1,string2);
        String marker = common[0];
        for (int i = 1; i < common.length; i++) {
            if (marker.length() < common[i].length()){
                marker=common[i];
            }
        }
        return marker;
    }


}
