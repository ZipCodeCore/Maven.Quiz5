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

        if(string.length() == 1) {
            String[] str = new String[1];
            for (int i = 0; i < 1; i++) {
                str[i] = string;
                return str;
            }
        }

        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                   strList.add(string.substring(i,j));
            }
            }

        String[] str2 = new String[strList.size()];

        for (int j = 0; j < strList.size(); j++) {

            str2[j] = strList.get(j);
        }

        Set<String> set = new HashSet<>(Arrays.asList(str2));


        int n = set.size();
        String[] arrStr = new String[n];

        int i = 0;
        for (String x : set)
            arrStr[i++] = x;

    return arrStr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
