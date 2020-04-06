package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    private String str;
    private StringEvaluator se;

    public StringEvaluatorObject(String str) {
        this.str = str;
        this.se = new StringEvaluator();
    }

    public String[] getAllSubstrings() {
        return se.getAllSubstrings(str);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return se.getCommonSubstrings(str, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return se.getLargestCommonSubstring(str,secondInput);
    }
}
