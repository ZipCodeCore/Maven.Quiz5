package rocks.zipcode.io.quiz4.objectorientation;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    private String string;

    public PalindromeObject(String input) {
        this.string = input;
    }

    public String[] getAllPalindromes() {
        Set<String> resultsList = new LinkedHashSet<>();
        for(int i = 0; i < this.string.length() - 1; i++){
            for(int j = i + 1; j< string.length(); j++){
                if(isPalindrome(string.substring(i,j))){
                    resultsList.add(string.substring(i,j));
                }
                if(isPalindrome(string.substring(j))){
                    resultsList.add(string.substring(j));
                }
            }
        }
        if(isPalindrome(string)) resultsList.add(string);
        return resultsList.toArray(new String[resultsList.size()]);
    }

    public Boolean isPalindrome(){
        return isPalindrome(this.string);
    }

    public Boolean isPalindrome(String string) {
        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String reverseString() {
        String result = "";
        for(int i = 0; i < string.length(); i++){
            result += string.charAt(string.length() - 1 - i);
        }
        return result;
    }
}
