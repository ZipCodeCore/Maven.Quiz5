package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> tempList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length() ; j++) {
                String temp = string.substring(i,j);
                if(!tempList.contains(temp)){
                    tempList.add(temp);
                }
            }
        }
        return tempList.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> s1 = new ArrayList<>(Arrays.asList(getAllSubstrings(string1)));
        ArrayList<String> s2 = new ArrayList<>(Arrays.asList(getAllSubstrings(string2)));
        ArrayList<String> result = new ArrayList<>();
        s1.forEach(s -> {
            if(s2.contains(s)){
                result.add(s);
            }
        });
        return result.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] common = getCommonSubstrings(string1,string2);
        String result = common[0];
        for (String s : common) {
            if(s.length() > result.length()){
                result = s;
            }
        }
        return result;
    }
}
