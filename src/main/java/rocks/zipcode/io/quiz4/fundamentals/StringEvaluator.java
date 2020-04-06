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
        Set<String> subsList = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                subsList.add(string.substring(i, j));
            }
        }
        String[] substrings = subsList.toArray(new String[subsList.size()]);
        return substrings;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String [] strArr1 = getAllSubstrings(string1);
        String [] strArr2 = getAllSubstrings(string2);
        List<String> newList = new ArrayList<>();
        for (String a : strArr1) {
            for (String b : strArr2) {
                if (a.equals(b)) {
                    newList.add(a);
                }
            }
        }
        String[] commonSubs = newList.toArray(new String[newList.size()]);
        return commonSubs;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubs = getCommonSubstrings(string1, string2);
        String result = "";
        for (String substring : commonSubs) {
            if(result.length() < substring.length()){
                result = substring;
            }
        }
        return result;
    }
}
