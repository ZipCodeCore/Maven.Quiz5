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
        getAllSubstrings(string1);
        getAllSubstrings(string2);
        if (getAllSubstrings(string1).equals(getAllSubstrings(string2))){
            //not sure where to go from here at the moment

        }
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
