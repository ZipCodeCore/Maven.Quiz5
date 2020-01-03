package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject extends StringEvaluator  {
    private String str;
    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public String[] getAllSubstrings() {
        List<String> substrList = new ArrayList<String>();


        for(int i = 0; i<str.length(); i++) {
            for(int j = i+1; j<=str.length();j++ ) {
                substrList.add( str.substring(i,j));
            }
        }
        ArrayList<String> newList = new ArrayList<String>();
        for(String element:substrList){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        String[] arr =newList.toArray(new String[0]);

        return arr;
    }

    public String[] getCommonSubstrings(String secondInput) {
        String[]arr = getAllSubstrings(secondInput);
        String[]arr1 = getAllSubstrings(str);
        ArrayList<String>list = new ArrayList<>(Arrays.asList(arr));
        List<String>newList = new ArrayList<>();
        for(int i = 0; i< arr1.length; i++){
            if(list.contains(arr1[i])){
                newList.add(arr1[i]);
            }
        }
        String[] arr2 = newList.toArray(new String[0]);
        return arr2;

    }

    public String getLargestCommonSubstring(String secondInput){
        String[]arr = getCommonSubstrings(str,secondInput);
        String largestCommon = arr[0];
        for(int i = 1 ;i <arr.length; i++){
            if(arr[i].length() >= largestCommon.length()){
                largestCommon = arr[i];
            }
        }

        return largestCommon;
    }



}
