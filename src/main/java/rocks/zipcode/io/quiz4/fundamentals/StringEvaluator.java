package rocks.zipcode.io.quiz4.fundamentals;

import rocks.zipcode.io.quiz4.collections.SimpleStringGroup;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        SimpleStringGroup group = new SimpleStringGroup();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                if (!group.has(string.substring(i, j)))
                    group.insert(string.substring(i, j));
            }
        }
        return group.getArr();
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        SimpleStringGroup group = new SimpleStringGroup();
        String[] gr1 = getAllSubstrings(string1);

        for (int i = 0; i < gr1.length; i++) {
            if (string2.contains(gr1[i]) && !group.has(gr1[i])) {
                group.insert(gr1[i]);
            }
        }
        return group.getArr();
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] common = getCommonSubstrings(string1, string2);
        String lgCommon = "";
        for (String word : common) {
            if (word.length() > lgCommon.length()) {
                lgCommon = word;
            }
        }
        return lgCommon;
    }
}
