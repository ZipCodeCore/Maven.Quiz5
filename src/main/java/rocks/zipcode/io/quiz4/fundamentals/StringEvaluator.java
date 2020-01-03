package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> substringList = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i+1; j <= string.length(); j++){
                if(!substringList.contains(string.substring(i,j))){
                    substringList.add(string.substring(i,j));
                }
            }
        }

        return substringList.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] substringArray1 = getAllSubstrings(string1);
        String[] substringArray2 = getAllSubstrings(string2);

        ArrayList<String> commonSubstrings = new ArrayList<>();

        for(int i = 0; i < substringArray1.length; i++){
            for(int j = 0; j < substringArray2.length; j++){
                if(substringArray1[i].equals(substringArray2[j])){
                    commonSubstrings.add(substringArray1[i]);
                }
            }
        }

        return commonSubstrings.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        Integer length = 0;
        String longestSubstring = "";
        for(int i = 0; i < commonSubstrings.length; i++){
            if(commonSubstrings[i].length() > length){
                longestSubstring = commonSubstrings[i];
                length = longestSubstring.length();
            }
        }
        return longestSubstring;
    }
}
