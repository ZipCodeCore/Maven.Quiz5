package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        List<String> newArray = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i + 1; j <= string.length(); j++){
                if(newArray.contains(string.substring(i,j))){
                    continue;
                }
                else {
                    newArray.add(string.substring(i, j));
                }
            }
        }
        String[] stringArray = newArray.toArray(new String[0]);
        return stringArray;
    }


    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] newArray1 = StringEvaluator.getAllSubstrings(string1);
        String[] newArray2 = StringEvaluator.getAllSubstrings(string2);
        List<String> newArray3 = Arrays.asList(newArray1);
        List<String> newArray4 = Arrays.asList(newArray2);
        List<String> outputArray = new ArrayList<>();
        for(String a : newArray3){
            if(newArray4.contains(a)){
                outputArray.add(a);
            }
        }
        String[] outputArray2 = outputArray.toArray(new String[outputArray.size()]);

        return outputArray2;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] newArray = StringEvaluator.getCommonSubstrings(string1, string2);
        String returnString = "";
        Integer count = 0;
        for(String a : newArray){
            if(a.length() > count){
                returnString = a;
                count = a.length();
            }
        }
        return returnString;
    }
}
