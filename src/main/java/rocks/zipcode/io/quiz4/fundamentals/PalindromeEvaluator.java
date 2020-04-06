package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

//        String myString = "anna";
//        StringBuffer buffer = new StringBuffer(myString);
//        buffer.reverse();
//        String data = buffer.toString();
//        if(myString.equals(data)){
//            System.out.println("Given String is palindrome");
//        } else {
//            System.out.println("Given String is not palindrome");
//        }

        return null;
}
    public static Boolean isPalindrome(String string) {

        for(int i=0;i<=string.length()/2;i++)
            if(string.charAt(i)!=string.charAt(string.length()-1-i))
                return false;
        return true;

    }

    public static String reverseString(String string) {

//        String rev = string;
//        int length = string.length();
//
//        for ( int i = length - 1; i >= 0; i-- )
//            rev = rev + string.charAt(i);
//
//        return rev;
    StringBuilder builder = new StringBuilder();
        for(int i = string.length()-1; i >= 0 ; i--) {
        builder.append(string.charAt(i));
    }
        return builder.toString();
}
}
