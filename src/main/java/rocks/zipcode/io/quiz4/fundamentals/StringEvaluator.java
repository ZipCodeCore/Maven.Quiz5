package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> list = new HashSet<>();

        for(int i=0; i <= string.length(); i++ ){
            for (int g = i+1 ; g <= string.length(); g++) {
                list.add(string.substring(i,g));
            }
        }
        return list.toArray( new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] longer;
        String[] shorter;
        if(string1.length()>string2.length()){
            longer = getAllSubstrings(string1);
            shorter = getAllSubstrings(string2);
        }else{
            longer = getAllSubstrings(string2);
            shorter = getAllSubstrings(string1);
        }

        ArrayList<String> a = new ArrayList<>();
        for (String s:shorter){
            for (String s2 :longer) {
                if(s2.equals(s)){
                   a.add(s2);
                }
            }
        }

        return a.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] a = getCommonSubstrings(string1,string2);
        String largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if(largest.length()<a[i].length()){
                largest = a[i];
            }
        }
        return largest;
    }
}
