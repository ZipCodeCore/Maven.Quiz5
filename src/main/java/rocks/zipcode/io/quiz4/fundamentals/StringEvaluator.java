package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {

    public static String[] getAllSubstrings(String string) {
        Set<String> subs = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                subs.add(string.substring(i, j));
                System.out.println(subs);
            }
        }
//        Object[] result = subs.toArray();
//        String[] answer = Arrays.copyOf(result,);
        String[] answer = subs.toArray(new String[subs.size()]);
        return answer;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> common = new HashSet<>();
        String[] arr1 = getAllSubstrings(string1);
        String[] arr2 = getAllSubstrings(string2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])){

                    common.add(arr1[i]);
            }
        }
        }
        return common.toArray(new String[common.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] result = getCommonSubstrings(string1, string2);

        return null;
    }
}
