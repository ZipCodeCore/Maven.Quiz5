package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String input;
    PalindromeEvaluator evaluator = new PalindromeEvaluator();


    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        return evaluator.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){
        return evaluator.isPalindrome(input);
    }

    public String reverseString(){
        return evaluator.reverseString(input);
    }
}
