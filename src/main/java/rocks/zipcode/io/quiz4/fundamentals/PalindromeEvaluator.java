package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string)
    {
        String[] result = new String[0];

        for(Integer i = 0; i < string.length(); i++)
        {
            for(Integer k = i; k <= string.length(); k++)
            {
                String substring = string.substring(i, k);

                if(isPalindrome(substring) && doesNotContain(substring, result) && !substring.equals(""))
                {
                    result = addToStringArray(substring, result);
                }
            }
        }

        return result;
    }

    public static Boolean isPalindrome(String string)
    {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string)
    {
        char[] arrayOfChar = string.toCharArray();
        StringBuilder result = new StringBuilder();

        for(Integer i = arrayOfChar.length - 1; i >= 0; i--)
        {
            result.append(arrayOfChar[i]);
        }

        return result.toString();
    }

    public static Boolean doesNotContain(String string, String[] array)
    {
        for (String s : array)
        {
            if (string.equals(s))
            {
                return false;
            }
        }

        return true;
    }

    public static String[] addToStringArray(String addedString, String[] stringArray)
    {
        String[] result = new String[stringArray.length + 1];

        for(Integer i = 0; i < stringArray.length; i++)
        {
            result[i] = stringArray[i];
        }

        result[result.length - 1] = addedString;

        return result;
    }
}
