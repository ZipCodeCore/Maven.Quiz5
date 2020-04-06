package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    String str;

    public PalindromeObject(String input) {
        this.str = input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(str);
    }

    public Boolean isPalindrome(){
        return PalindromeEvaluator.isPalindrome(str);
    }

    public String reverseString(){
        return PalindromeEvaluator.reverseString(str);
    }
}
