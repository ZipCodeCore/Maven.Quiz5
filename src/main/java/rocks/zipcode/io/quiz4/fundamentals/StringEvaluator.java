package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        List<String> subStrings = new ArrayList<> ();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++){
                if (!subStrings.contains(string.substring(i, j)))
                    subStrings.add(string.substring(i, j));
            }
        }
        return subStrings.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] array1 = getAllSubstrings ( string1 );
        String[] array2 = getAllSubstrings ( string2 );
        List<String> commonSubs = new ArrayList<> (  );
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals ( array2[j] ) ) {
                    commonSubs.add ( array2[j] );
                }
            }
        }
        return commonSubs.toArray ( new String[0] );
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] baseArray = getCommonSubstrings ( string1, string2 );
        String largestCommon = baseArray[0];
        for (int i = 1; i < baseArray.length; i++) {
            if (baseArray[i].length () > largestCommon.length ()) {
                largestCommon = baseArray[i];
            }
        }
        return largestCommon;
    }
}
