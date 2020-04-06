package rocks.zipcode.io.quiz4.fundamentals;

import java.util.LinkedHashSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        LinkedHashSet<String> substrings =new LinkedHashSet<>();
        for(int i =0; i< string.length();i++){
            for(int j=i+1; j<= string.length(); j++){
                substrings.add(string.substring(i,j));
            }
        }
        return substrings.toArray(new String[1]);
    }



    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        return null;
    }
}
