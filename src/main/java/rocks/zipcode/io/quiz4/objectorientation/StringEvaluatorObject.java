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
    String[] arr2;

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
        return arr;
    }

    public String[] getAllSubstringsAgain() {
        Set<String> setOfStrings = new HashSet<>();
        for (int i = 0; i < this.string2.length(); i++) {
            for (int j = i + 1; j <= this.string2.length(); j++) {
                setOfStrings.add(this.string2.substring(i, j));
            }
        }
        String[] arr = new String[setOfStrings.size()];
        arr = setOfStrings.toArray(arr);
        return arr;
    }

    public String[] getCommonSubstrings(String secondInput) {
        string2 = secondInput;
        arr1 = getAllSubstrings();
        arr2 = getAllSubstringsAgain();

        List<String> common = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    common.add(arr1[i]);
                }
            }
        }

        String[] arr = new String[common.size()];
        for (int i = 0; i < common.size(); i++) {
            arr[i] = common.get(i);
        }
        return arr;
    }

    public String getLargestCommonSubstring(String secondInput) {
        String[] commonSubstrings = getCommonSubstrings(secondInput);
        String winner = "";
        for (int i = 0; i < commonSubstrings.length - 1; i++) {
            int size = commonSubstrings[i].length();
            if (size > commonSubstrings[i + 1].length()) {
                winner = commonSubstrings[i];
            }
        }
        return winner;
    }
}
