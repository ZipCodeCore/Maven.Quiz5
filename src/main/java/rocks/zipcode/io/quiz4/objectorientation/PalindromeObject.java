package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String s;

    public PalindromeObject(String input) {
        s=input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(s);
    }

    public Boolean isPalindrome(){
        return PalindromeEvaluator.isPalindrome(s);
    }

    public String reverseString(){
        return PalindromeEvaluator.reverseString(s);
    }
}
