package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {


        return null;
    }

    public static Boolean isPalindrome(String string) {

        for(int i=0;i<=string.length()/2;i++)
            if(string.charAt(i)!=string.charAt(string.length()-1-i))
                return false;
        return true;

    }

    public static String reverseString(String string) {
        return null;
    }
}
