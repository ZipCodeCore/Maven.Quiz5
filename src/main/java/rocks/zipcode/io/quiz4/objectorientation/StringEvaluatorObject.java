package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.*;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    private final String input;

    public StringEvaluatorObject(String str) {
        this.input = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(this.input);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(this.input, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(this.input, secondInput);
    }
}
