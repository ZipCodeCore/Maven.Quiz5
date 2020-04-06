package rocks.zipcode.io.quiz4.objectorientation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    private String input;

    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes() {

        Set<String> result = new HashSet<String>();

        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                StringBuilder sb = new StringBuilder(input.substring(i,j));
                if(input.substring(i, j).equals(sb.reverse().toString())) {
                    result.add(input.substring(i, j));
                }
            }
        }

        String[] toReturn = new String[result.size()];
        return result.toArray(toReturn);
    }

    public Boolean isPalindrome(){

        StringBuilder sb = new StringBuilder(input);
        return input.equals(sb.reverse().toString());
    }

    public String reverseString(){

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
