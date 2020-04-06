package rocks.zipcode.io.quiz4.objectorientation;


import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    String string;
    String toCheck;

    public PalindromeObject(String input) {
        string = input;
    }

    public String[] getAllPalindromes(){
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (isPalindrome()) {
                    palindromes.add(string);
                }
                toCheck = string.substring(i, j);
                if (isSubstringPalindrome()) {
                    palindromes.add(toCheck);
                }
            }
        }
        String[] arr = new String[palindromes.size()];
        int i = 0;
        for (String element : palindromes) {
            arr[i++] = element;
        }
        return arr;
    }

    public Boolean isSubstringPalindrome() {
        int start = 0;
        int end = this.toCheck.length() - 1;

        while (start < end) {
            if (this.toCheck.charAt(start) != this.toCheck.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
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
