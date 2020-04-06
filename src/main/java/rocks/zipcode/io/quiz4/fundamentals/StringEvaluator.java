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

        Set<String> result = new HashSet<String>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                result.add(string.substring(i, j));
            }
        }
        String [] toReturn = new String[result.size()];
        return result.toArray(toReturn);
    }


    public static String[] getCommonSubstrings(String string1, String string2) {

        String[] s1SS = getAllSubstrings(string1);
        String[] s2SS = getAllSubstrings(string2);
        ArrayList<String> results = new ArrayList<>(Arrays.asList(s1SS));
        results.retainAll(Arrays.asList(s2SS));
        return results.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        String[] cSS = getCommonSubstrings(string1, string2);
        int max =0;
        String ls = cSS[0];
        for (int i = 0; i < cSS.length; i++) {
            if(cSS[i].length() > max) {
                ls = cSS[i];
                max = cSS[i].length();
            }
        }
        return ls;
    }

}
