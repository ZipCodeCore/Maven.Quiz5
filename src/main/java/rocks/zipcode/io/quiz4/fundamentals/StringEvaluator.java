package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> arrList = new ArrayList<>();


        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                if(!arrList.contains(string.substring(i, j))) {
                    arrList.add(string.substring(i, j));
                }
            }
        }
        String[] result = arrList.toArray(new String[arrList.size()]);
        return result;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> tempList = new ArrayList<>();
        String [] temp1 = getAllSubstrings(string1);
        String[] temp2 = getAllSubstrings(string2);

        for (String word:temp1) {
            for (String word2: temp2) {
                if(word2.equals(word)){
                    tempList.add(word2);
                }
            }
        }
        String[] answer = tempList.toArray(new String[tempList.size()]);
        return answer;

    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] temp = getCommonSubstrings(string1, string2);
        String Largest = temp[0];

        for (String word: temp) {
            if(word.length() > Largest.length()){
                Largest = word;
            }
        }
        return Largest;
    }

}
