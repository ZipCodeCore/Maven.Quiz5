package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> result = new HashSet<>();
        for(int i=0;i<=string.length();i++){
            for(int j=i;j<string.length();j++){
                result.add(string.substring(i,j+1));
            }
        }
        return result.toArray(new String[0]);

    }


    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> allStrings = new ArrayList<>();
        allStrings.addAll(Arrays.asList(getAllSubstrings(string1)));
        allStrings.addAll(Arrays.asList(getAllSubstrings(string2)));
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < allStrings.size();i++){
            for( int j = i; j < allStrings.size() - 1; j++){
                if(allStrings.get(i).equals(allStrings.get(j + 1))){
                    result.add(allStrings.get(i));
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        ArrayList<String> commonSubstrings = new ArrayList<>(Arrays.asList(getCommonSubstrings(string1, string2)));

        Integer largest = 0;
        for(int i = 0; i < commonSubstrings.size(); i++){
            if (commonSubstrings.get(i).length() > largest){
                largest = i;
            }
        }

        return commonSubstrings.get(largest);
    }
}
