package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    public PalindromeObject(String input) {
    }

    public String[] getAllPalindromes(){
        return null;
    }

    public Boolean isPalindrome(){
        String clean = "".replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;

       // return null;

    }

    public String reverseString(){
        StringBuilder reverse = new StringBuilder();
        String clean = "".replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return String.valueOf((reverse.toString()).equals(clean));
        //return null;
    }
}
