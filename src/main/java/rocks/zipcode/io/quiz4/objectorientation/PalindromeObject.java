package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String inputString;
    public PalindromeObject(String input) {
        inputString = input;
    }

    public String[] getAllPalindromes(){

        return PalindromeEvaluator.getAllPalindromes(inputString);
    }

    public Boolean isPalindrome(){

        return inputString.equals(reverseString());
    }

    public String reverseString(){

        return PalindromeEvaluator.reverseString(inputString);
    }
}
