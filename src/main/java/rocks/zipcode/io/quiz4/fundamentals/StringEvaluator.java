package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            for (int j = i+1; j <= string.length(); j++) {
                if(!arrayList.contains(string.substring(i, j)))
                    arrayList.add(string.substring(i, j));
            }
        }
        return arrayList.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] arr1 = getAllSubstrings(string1);
        String[] arr2 = getAllSubstrings(string2);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String substring1 : arr1) {
            for (String substring2 : arr2) {
                if (substring1.equals(substring2)) {
                    arrayList.add(substring1);
                }
            }
        }
        return arrayList.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonArr = getCommonSubstrings(string1, string2);
        int counter = 0;
        int stringLength = commonArr[0].length();
        for (int i = 0; i < commonArr.length; i++) {
            if(commonArr[i].length() > stringLength) {
                counter = i;
                stringLength = commonArr[i].length();
            }
        }
        return commonArr[counter];
    }
}
