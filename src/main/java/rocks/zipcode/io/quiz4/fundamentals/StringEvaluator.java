package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        List<String> listOfSubs = new ArrayList<>();
        for(int i =0 ; i < string.length(); i++){
            for(int j =i+1 ; j < string.length()+1; j++){
                String current = string.substring(i,j);
                if(!listOfSubs.contains(current)){
                    listOfSubs.add(current);
                }
            }
        }
        return listOfSubs.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String [] string1Subs = getAllSubstrings(string1);
        String [] string2Subs = getAllSubstrings(string2);
        List<String> commonSubs = new ArrayList<>();
        for(int i =0; i < string1Subs.length; i++){
            for(int j = 0; j < string2Subs.length; j++){
                if(string1Subs[i].equals(string2Subs[j])){
                    commonSubs.add(string1Subs[i]);
                }
            }
        }
        return commonSubs.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubs = getCommonSubstrings(string1, string2);
        String bigFella = commonSubs[0];
        for(int i =0 ; i < commonSubs.length; i++){
            if(commonSubs[i].length() > bigFella.length()){
                bigFella = commonSubs[i];
            }
        }
        return bigFella;
    }
}
