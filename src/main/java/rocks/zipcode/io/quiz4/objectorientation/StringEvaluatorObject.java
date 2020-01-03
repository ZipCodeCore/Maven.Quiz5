package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String str;

    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public String[] getAllSubstrings() {
        ArrayList<String> arrList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j < str.length() + 1; j++){
                if (!arrList.contains((str.substring(i, j)))) {
                    arrList.add(str.substring(i, j));
                }
            }
        }
        return arrList.toArray(new String[0]);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return null;
    }

    public String getLargestCommonSubstring(String secondInput) {
        int[][] table = new int[str.length()][secondInput.length()];
        int longest = 0;
        Set<String> result = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < secondInput.length(); j++) {
                if (str.charAt(i) != secondInput.charAt(j)) {
                    continue;
                }

                table[i][j] = (i == 0 || j == 0) ? 1
                        : 1 + table[i - 1][j - 1];
                if (table[i][j] > longest) {
                    longest = table[i][j];
                    result.clear();
                }
                if (table[i][j] == longest) {
                    result.add(str.substring(i - longest + 1, i + 1));
                }
            }
        }
        return result.toString().replace("[", "").replace("]", "");
    }
}
