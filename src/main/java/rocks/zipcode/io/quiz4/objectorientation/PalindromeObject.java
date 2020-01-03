package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String input;

    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        return null;
    }

    public Boolean isPalindrome(){
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j))
                return false;

            i++;
            j++;
            return true;
        }
        return null;
    }

    public String reverseString(){
        char[] reversedString = input.toCharArray();
        int start = 0;
        int end = reversedString.length - 1;
        char temp;

        while (end > start) {
            temp = reversedString[start];
            reversedString[start] = reversedString[end];
            reversedString[end] = temp;
            end--;
            start++;
        }
        return new String(reversedString);
    }
}
