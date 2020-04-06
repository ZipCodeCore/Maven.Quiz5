package rocks.zipcode.io.quiz4.objectorientation;


/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    String string;

    public PalindromeObject(String input) {
        string = input;
    }

    public String[] getAllPalindromes(){
        return null;
    }

    public Boolean isPalindrome(){
        int start = 0;
        int end = this.string.length() - 1;

        while (start < end) {
            if (this.string.charAt(start) != this.string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String reverseString(){
        StringBuilder reversed = new StringBuilder();
        reversed.append(this.string);
        reversed.reverse();
        return reversed.toString();
    }
}
