package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;
    private PalindromeEvaluator ev = new PalindromeEvaluator();
    public PalindromeObject(String input) {
        this.input = input;
    }

    public PalindromeObject(){
        this.input = input;
    }

    public String[] getAllPalindromes()
    {
        return ev.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){

        return ev.isPalindrome(input);
    }

    public String reverseString(){
        String reverseString = new StringBuilder(input).reverse().toString();

        return reverseString;
    }
}
