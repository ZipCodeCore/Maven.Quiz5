package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.*;

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



    public static String[] getCommonSubstrings(String string1, String string2)
    {
        List<String> strList1 = Arrays.asList(getAllSubstrings(string1));
        List<String> strList2 = Arrays.asList(getAllSubstrings(string2));
        Set<String> commonSet = new HashSet<>(strList1);
        commonSet.retainAll(strList2);
         return commonSet.toArray(new String[commonSet.size()]);

    }

    public static String getLargestCommonSubstring(String string1, String string2)
    {
 List<String> commonList = Arrays.asList(getCommonSubstrings(string1, string2));
 String currentLargest = commonList.get(0);
 for(String str : commonList){
     if (str.length() > currentLargest.length()){
         currentLargest = str;
     }
 }
        return currentLargest;
    }
}
