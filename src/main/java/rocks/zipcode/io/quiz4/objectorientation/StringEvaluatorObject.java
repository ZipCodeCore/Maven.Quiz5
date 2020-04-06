package rocks.zipcode.io.quiz4.objectorientation;

import java.util.*;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String str;
    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public String[] getAllSubstrings() {
        Set<String> subs = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subs.add(str.substring(i,j));
                cnt++;
            }
        }

        String[] arr = new String[subs.size()];


        return subs.toArray(arr) ;
    }
    public String[] getAllSubstrings2(String str) {
        Set<String> subs = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subs.add(str.substring(i,j));
                cnt++;
            }
        }

        String[] arr = new String[subs.size()];


        return subs.toArray(arr) ;
    }

    public String[] getCommonSubstrings(String secondInput) {
        String [] arr1 = getAllSubstrings2(str);
        String [] arr2 = getAllSubstrings2(secondInput);

        List<String> list= Arrays.asList(arr1);
        Set<String> set=new LinkedHashSet<>(Arrays.asList(arr1));
        set.retainAll(Arrays.asList(arr2));

        String[] result = new String[0];

        return set.toArray(result);
    }
    public String[] getCommonSubstrings2(String str, String secondInput) {
        String [] arr1 = getAllSubstrings2(str);
        String [] arr2 = getAllSubstrings2(secondInput);

        List<String> list= Arrays.asList(arr1);
        Set<String> set=new LinkedHashSet<>(Arrays.asList(arr1));
        set.retainAll(Arrays.asList(arr2));

        String[] result = new String[0];

        return set.toArray(result);
    }

    public String getLargestCommonSubstring(String secondInput) {

        String[] result = getCommonSubstrings2(str, secondInput);
        Arrays.sort(result, Comparator.comparingInt(String::length));

        return result[result.length-1];    }
}
