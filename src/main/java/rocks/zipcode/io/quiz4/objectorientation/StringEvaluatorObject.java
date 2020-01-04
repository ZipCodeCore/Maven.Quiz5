package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String result;

    public StringEvaluatorObject(String str) {
        result = str;
    }

    public String[] getAllSubstrings() {

        return StringEvaluator.getAllSubstrings(result);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(result,secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(result,secondInput);
    }
}
