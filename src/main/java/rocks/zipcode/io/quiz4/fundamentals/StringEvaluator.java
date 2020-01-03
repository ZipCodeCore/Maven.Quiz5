package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {

    static int counter = 0;

    public static String[] getAllSubstrings(String string) {

        HashSet<String> temp = new HashSet<>();
        String [] word = string.split("");
        String interim = "";
        String [] result;

        for (int i = 0; i < word.length; i++){
            interim = "";
            temp.add(word[i]);
            interim = word[i];
            counter++;
            for (int k = i + 1; k < word.length; k ++){
                interim = interim.concat(word[k]);
                temp.add(interim);
                counter++;
            }
        }
        result = new String[temp.size()];
        return temp.toArray(result);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String [] s1Substrings = getAllSubstrings(string1);
        String [] s2Substrings = getAllSubstrings(string2);
        ArrayList<String> temp = new ArrayList<>();

        for (String each : s1Substrings){
            for (String each2 : s2Substrings){
                if (each.equals(each2)) temp.add(each2);
            }
        }

        String [] result = new String[temp.size()];
        return temp.toArray(result);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
