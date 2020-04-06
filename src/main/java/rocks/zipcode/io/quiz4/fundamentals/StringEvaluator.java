package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        TreeSet<String> subs = new TreeSet<>();
        subs = new TreeSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {

                subs.add(string.substring(i, j));
            }
        }
//        for (int i = 0; i<string.length(); i++)   {
//            subs.add(string.substring(i,1));
//        }
        String[] subsArr = new String[subs.size()];
        subsArr = subs.toArray(subsArr);
        return subsArr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> result1 = new ArrayList<String>(Arrays.asList(getAllSubstrings(string1)));
        ArrayList<String> result2 = new ArrayList<String>(Arrays.asList(getAllSubstrings(string2)));
        TreeSet<String> resultSet = new TreeSet<>();


        int length = result1.size() > result2.size() ? result1.size() : result2.size();
        for (int i = 0; i< length; i++) {
            if(result1.size() > result2.size()) {
                if(result2.contains(result1.get(i)))    {
                    resultSet.add(result1.get(i));
                }
            }   else    {
                if(result1.contains(result2.get(i)))    {
                    resultSet.add(result2.get(i));
                }
            }

        }
        String[] subsArr = new String[resultSet.size()];
        subsArr = resultSet.toArray(subsArr);

        return subsArr;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] subsArr = getCommonSubstrings(string1, string2);
        String largest = subsArr[0];

        for(int i = 1; i<subsArr.length; i++)   {
            if(subsArr[i].length() > largest.length())    {
                largest = subsArr[i];
            }
        }

        return largest;
    }
}
