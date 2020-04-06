package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> subs = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            for(int j = i+1 ; j<= string.length();j++){
                subs.add(string.substring(i,j));
            }
        }
        Set<String> stringSet = new LinkedHashSet<>(subs);
        String[] substrings = new String[stringSet.size()];
        stringSet.toArray(substrings);
        return substrings;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> comSubSet = new LinkedHashSet<>();
        int counter = 0;
        for (String sub1: getAllSubstrings(string1)){
            for (String sub2: getAllSubstrings(string2)){
                if (sub1.equals(sub2)){
                    comSubSet.add(sub1);
                }

            }
        }
        String[] comSubArray = new String[comSubSet.size()];
        comSubSet.toArray(comSubArray);

        return comSubArray;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String largest = "";
        for (String str : getCommonSubstrings(string1,string2)){
            if (str.length()>largest.length()){
                largest = str;
            }
        }
        return largest;
    }
}
