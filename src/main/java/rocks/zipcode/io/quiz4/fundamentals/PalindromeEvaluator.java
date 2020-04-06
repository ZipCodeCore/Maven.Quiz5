package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length() ; j++) {
                if(isPalindrome(string.substring(i,j))){
                    palindromes.add(string.substring(i,j));
                }
            }
        }
        return palindromes.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        String lower = string.replaceAll("\\s+", "".toLowerCase());
        return IntStream.range(0, lower.length() /2)
                .noneMatch(i -> lower.charAt(i) != lower.charAt(lower.length()-i-1));
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
