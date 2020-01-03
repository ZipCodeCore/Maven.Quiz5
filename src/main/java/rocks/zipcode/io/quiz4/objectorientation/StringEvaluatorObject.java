package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
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



        return null;
    }

    public String getLargestCommonSubstring(String secondInput) {
        return null;
    }
}
