package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String st;
    public StringEvaluatorObject(String str) {
        this.st = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(st);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(st,secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(st, secondInput);
    }
}
