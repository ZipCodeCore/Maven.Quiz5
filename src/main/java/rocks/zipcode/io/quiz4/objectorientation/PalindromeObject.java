package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String string;
    public PalindromeObject(String input) {
        string=input;
    }

    public String[] getAllPalindromes(){

        return null;
    }

    public Boolean isPalindrome(){
       return PalindromeEvaluator.isPalindrome(this.string);

    }

    public String reverseString(){

        return null;
    }
}
