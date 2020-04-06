package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    private String word;
    public PalindromeObject(String input) {
        this.word = input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(word);
    }

    public Boolean isPalindrome(){

        return PalindromeEvaluator.isPalindrome(word);
    }

    public String reverseString(){

        return PalindromeEvaluator.reverseString(word);

    }
}
