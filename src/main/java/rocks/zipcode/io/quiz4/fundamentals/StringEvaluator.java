package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                result.add(string.substring(i,j));
            }
        }
        return result.stream().distinct().toArray(String[]::new);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> list1 = Arrays.asList(getAllSubstrings(string1));
        List<String> list2 = Arrays.asList(getAllSubstrings(string2));
        return list1.stream()
                .distinct()
                .filter(list2::contains).toArray(String[]::new);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        List<String> commonSS = Arrays.asList(getCommonSubstrings(string1,string2));
        return Collections.max(commonSS, Comparator.comparing(String::length));
    }

}
