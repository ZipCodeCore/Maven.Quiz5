package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    private String input;
    private PalindromeEvaluator pe;


    public PalindromeObject(String input) {
        this.input = input;
        this.pe = new PalindromeEvaluator();
    }

    public String[] getAllPalindromes(){
        return pe.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){
        return pe.isPalindrome(input);
    }

    public String reverseString(){
        return pe.reverseString(input);
    }
}
