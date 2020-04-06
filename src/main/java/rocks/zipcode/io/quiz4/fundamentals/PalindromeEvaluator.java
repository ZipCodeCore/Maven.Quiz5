package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
    }

    public static Boolean isPalindrome(String string) {
        String reversedString = new StringBuffer(string).reverse().toString();
        if(string.equals(reversedString)) {
            return true;
        }
      return false;
    }

    public static String reverseString(String string) {
       StringBuilder reversedString = new StringBuilder(string);
       return reversedString.reverse().toString();
    }
    }

