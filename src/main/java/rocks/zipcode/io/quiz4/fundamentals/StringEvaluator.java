package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        if(string.length() == 1){
            String[] str = new String[1];
            for(int i = 0; i < 1; i++){
                str[i] = string;
                return str;
            }
        }
        return null;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
