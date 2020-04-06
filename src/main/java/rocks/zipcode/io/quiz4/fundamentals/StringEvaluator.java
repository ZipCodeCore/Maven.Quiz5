package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;
import java.util.stream.Collector;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> ret = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i + 1; j <= string.length(); j++){
                ret.add(string.substring(i, j));
            }
        }
        return ret.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> common = new ArrayList<>();
        String[] sub1 = getAllSubstrings(string1);
        ArrayList sub2 = new ArrayList(Arrays.asList(getAllSubstrings(string2)));
        for(String s: sub1){
            if(sub2.contains(s))
                common.add(s);
        }
        return common.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] common = getCommonSubstrings(string1, string2);
        String max = common[0];
        for(String s : common){
            if(s.length() > max.length())
                max = s;
        }
        return max;
    }
}
