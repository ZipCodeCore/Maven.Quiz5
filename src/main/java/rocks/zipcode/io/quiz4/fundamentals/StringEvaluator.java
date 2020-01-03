package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                strings.add(string.substring(i, j));
            }

        }
        return strings.toArray(new String[0]);
    }


    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] sub1 = getAllSubstrings(string1);
        String[] sub2 = getAllSubstrings(string2);
        ArrayList<String> common = new ArrayList<>();
        for (int i = 0; i < sub1.length; i++) {
            for (int j = 0; j < sub2.length; j++) {
                if (sub1[i].equals(sub2[j])) {
                    common.add(sub2[j]);
                }

            }

        }
        return common.toArray(new String[0]);
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
