package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> subs = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                subs.add(string.substring(i,j));
                cnt++;
            }
        }

        String[] arr = new String[subs.size()];


        return subs.toArray(arr) ;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String [] arr1 = getAllSubstrings(string1);
        String [] arr2 = getAllSubstrings(string2);

        List<String> list= Arrays.asList(arr1);
        Set<String> set=new LinkedHashSet<>(Arrays.asList(arr1));
        set.retainAll(Arrays.asList(arr2));

        String[] result = new String[0];

        return set.toArray(result);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] result = getCommonSubstrings(string1, string2);
        Arrays.sort(result, Comparator.comparingInt(String::length));

        return result[result.length-1];
    }
}
