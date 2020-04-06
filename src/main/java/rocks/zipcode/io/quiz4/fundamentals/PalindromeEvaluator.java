package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
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

    public static String reverseString(String string) {
        String output = "";
        for (int i = string.length() - 1; i >= 0; i--){
            output = output + string.charAt(i);
        }
        return output;
    }
}
