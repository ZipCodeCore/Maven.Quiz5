package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {

    public static String[] GetStringArray(ArrayList<String> arr)
    {

        // declaration and initialise String Array
        String[] str = new String[arr.size()];

        // ArrayList to Array Conversion
        for (int j = 0; j < arr.size(); j++) {

            // Assign each value to String array
            str[j] = arr.get(j);
        }

        return str;

}
    public static String[] getAllSubstrings(String string) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                set.add(string.substring(i,j));
            }
        }
        return set.toArray(new String[0]);


    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] sub1 = getAllSubstrings(string1);
        String[] sub2 = getAllSubstrings(string2);

        ArrayList<String> comSubs = new ArrayList<>();
        for (int i = 0; i < sub1.length; i++) {
            for (int j = 0; j < sub2.length; j++) {// inner loop
                if (sub1[i].equals(sub2[j])) {
                    comSubs.add(sub1[i]);

                }
            }
        }
        return comSubs.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
