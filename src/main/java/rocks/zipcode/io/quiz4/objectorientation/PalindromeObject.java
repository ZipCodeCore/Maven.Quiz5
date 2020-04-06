package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;
    private PalindromeEvaluator palEval;

    public PalindromeObject(String input) {
        this.input = input;
        this.palEval = new PalindromeEvaluator();
    }

    public String[] getAllPalindromes(){
        return palEval.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){
        return palEval.isPalindrome(input);
    }

    public String reverseString(){
        return palEval.reverseString(input);
    }
}
