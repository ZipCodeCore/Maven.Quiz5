package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;

    public PalindromeObject(String input) {
    this.input = input;
    }

    public String[] getAllPalindromes(){
        String[] allPalindromes = PalindromeEvaluator.getAllPalindromes(input);
        return allPalindromes;
    }

    public Boolean isPalindrome(){

        return PalindromeEvaluator.isPalindrome(input);
    }

    public String reverseString(){
        String reverse = PalindromeEvaluator.reverseString(input);
        return reverse;
    }
}
