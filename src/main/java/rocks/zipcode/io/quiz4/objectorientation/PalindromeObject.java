package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String string = "";

    public PalindromeObject(String input) {
        this.string = string;
    }

    public String[] getAllPalindromes(){
        return null;
    }

    public Boolean isPalindrome(){
        int i = 0;
        int j = string.length() - 1;
        while (i < j){
            if (string.charAt(i) != string.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String reverseString(){
        String output = "";
        for (int i = string.length() - 1; i >= 0; i--){
            output = output + string.charAt(i);
        }
        return output;
    }
}
