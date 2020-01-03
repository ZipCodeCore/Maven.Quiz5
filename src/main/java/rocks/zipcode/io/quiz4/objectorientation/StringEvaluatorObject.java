package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String str;
    String secondInput;

    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public StringEvaluatorObject(String str, String secondInput) {
        this.str = str;
        this.secondInput = this.secondInput;
    }

    public String[] getAllSubstrings() {

        return StringEvaluator.getAllSubstrings(str);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(str, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        String largest = StringEvaluator.getLargestCommonSubstring(str, secondInput);

        return largest;
    }
}
