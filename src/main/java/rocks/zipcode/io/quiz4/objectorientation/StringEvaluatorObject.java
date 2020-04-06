package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String stringToEvaluate;
    public StringEvaluatorObject(String str) {
        this.stringToEvaluate = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(stringToEvaluate);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(stringToEvaluate,secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(stringToEvaluate,secondInput);
    }
}
