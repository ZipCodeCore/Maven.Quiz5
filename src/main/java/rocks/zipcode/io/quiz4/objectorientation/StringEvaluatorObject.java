package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    private String str;
    private String secondInput;
    private StringEvaluator stringEval;

    public StringEvaluatorObject(String str) {
        this.str = str;
        this.stringEval = new StringEvaluator();
    }

    public String[] getAllSubstrings() {
        return stringEval.getAllSubstrings(str);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return stringEval.getCommonSubstrings(str, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return stringEval.getLargestCommonSubstring(str, secondInput);
    }
}
