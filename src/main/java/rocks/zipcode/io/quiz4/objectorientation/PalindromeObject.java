package rocks.zipcode.io.quiz4.objectorientation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String input;
    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        Set<String> result = new HashSet<>();
        for(int i=0;i<=input.length();i++)
            for(int j=i;j<input.length();j++)
                if(checkPalindrome(input.substring(i,j+1))){
                    result.add(input.substring(i,j+1));
                }
        String[] temp = new String[result.size()];


        return result.toArray(temp);
    }
    public Boolean checkPalindrome(String input){
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        return input.equals(reverse);
    }

    public Boolean isPalindrome(){
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        return input.equals(reverse);
    }

    public String reverseString(){
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

}
