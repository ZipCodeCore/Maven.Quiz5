package rocks.zipcode.io.quiz4.objectorientation;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    private String string;

    public StringEvaluatorObject(String str) {
        this.string = str;
    }

    public String[] getAllSubstrings() {
        return getAllSubstrings(string);
    }

    public String[] getAllSubstrings(String string) {
        Set<String> resultsList = new LinkedHashSet<>();
        for(int i = 0; i < string.length() - 1; i++){
            for(int j = i + 1; j< string.length(); j++) {
                resultsList.add(string.substring(i, j));
                resultsList.add(string.substring(j));
            }
        }
        resultsList.add(string);
        return resultsList.toArray(new String[resultsList.size()]);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return getCommonSubstrings(this.string, secondInput);
    }

    public String[] getCommonSubstrings(String string1, String string2) {
        Set<String> resultsList = new LinkedHashSet<>();
        List<String> list1 = Arrays.asList(getAllSubstrings(string1));
        List<String> list2 = Arrays.asList(getAllSubstrings(string2));

        for(String s : list1){
            if(list2.contains(s)) resultsList.add(s);
        }
        return resultsList.toArray(new String[resultsList.size()]);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return getLargestCommonSubstring(string, secondInput);
    }

    public String getLargestCommonSubstring(String string1, String string2) {
        String[] commonList = getCommonSubstrings(string1,string2);
        String current = commonList[0];
        for(String s : commonList){
            if(s.length() > current.length()){
                current = s;
            }
        }
        return current;
    }
}
