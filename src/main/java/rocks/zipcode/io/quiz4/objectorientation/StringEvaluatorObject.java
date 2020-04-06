package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    String string;
    String string2;
    String[] arr1;

    public StringEvaluatorObject(String str) {
        this.string = str;
    }

    public String[] getAllSubstrings() {
        Set<String> setOfStrings = new HashSet<>();
        for (int i = 0; i < this.string.length(); i++) {
            for (int j = i + 1; j <= this.string.length(); j++) {
                setOfStrings.add(this.string.substring(i, j));
            }
        }
        String[] arr = new String[setOfStrings.size()];
        arr = setOfStrings.toArray(arr);
        arr1 = arr;
        return arr;
    }

    public String[] getCommonSubstrings(String secondInput) {

        return null;
    }

    public String getLargestCommonSubstring(String secondInput) {
        return null;
    }
}
