package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] allPali = new String[0];
        String[] allSub = StringEvaluator.getAllSubstrings(string);
        for(String s : allSub){
            if(isPalindrome(s))
                allPali = insert(allPali, s);
        }
        return allPali;
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder revString = new StringBuilder(string);
        revString.reverse();
        return revString.toString();
    }

    public static String[] insert(String[] input, String string){
        String[] retArr = new String[input.length+1];
        for(int i = 0; i < input.length; i++){
            retArr[i] = input[i];
        }
        retArr[input.length] = string;
        return retArr;
    }
}
