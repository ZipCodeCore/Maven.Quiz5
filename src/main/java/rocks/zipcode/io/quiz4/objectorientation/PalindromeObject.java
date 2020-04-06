package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;
    public PalindromeObject(String input) {
    }

    public PalindromeObject(){
        this.input = input;
    }

    public String[] getAllPalindromes()
    {
        return null;
    }

    public Boolean isPalindrome(){

        return null;
    }

    public String reverseString(){
        String reverseString = new StringBuilder(input).reverse().toString();

        return reverseString;
    }
}
