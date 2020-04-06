package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < string.length() ; i++) {
            for (int j = i+1; j <= string.length() ; j++) {
                substrings.add(string.substring(i,j));
            }
        }
        return substrings.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> commons = new ArrayList<>();
        for(String s : getAllSubstrings(string1)){
            if(Arrays.asList(getAllSubstrings(string2)).contains(s))
                commons.add(s);
        }
        return commons.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubs = getCommonSubstrings(string1, string2);
        Arrays.sort(commonSubs, Comparator.comparing(String::length));
        return commonSubs[commonSubs.length-1];
    }
}
