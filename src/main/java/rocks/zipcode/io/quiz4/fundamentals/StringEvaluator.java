package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string)
    {
        String[] result = new String[0];

        for(Integer i = 0; i < string.length(); i++)
        {
            for(Integer k = i; k <= string.length(); k++)
            {
                String substring = string.substring(i, k);

                if(doesNotContain(substring, result) && !substring.equals(""))
                {
                    result = addToStringArray(substring, result);
                }
            }
        }

        return result;
    }

    public static String[] getCommonSubstrings(String string1, String string2)
    {
        String[] subStrings1 = getAllSubstrings(string1);
        String[] subStrings2 = getAllSubstrings(string2);
        String[] result = new String[0];

        for(Integer i = 0; i < subStrings1.length; i++)
        {
            String subStringFrom1 = subStrings1[i];

            for(Integer k = 0; k < subStrings2.length; k++)
            {
                String subStringFrom2 = subStrings2[k];

                if(subStringFrom1.equals(subStringFrom2) && doesNotContain(subStringFrom1, result))
                {
                    result = addToStringArray(subStringFrom1, result);
                }
            }
        }
        return result;
    }

    public static String getLargestCommonSubstring(String string1, String string2)
    {
        String mostCommon = "";
        Integer occurrencesOfLargest = 0;
        String[] commonSubstrings = getCommonSubstrings(string1, string2);

        for(Integer i = 0; i < commonSubstrings.length; i++)
        {
            String substring = commonSubstrings[i];
            Integer currentCount = 0;

            for(Integer k = i; k < commonSubstrings.length; k++)
            {
                String currentString = commonSubstrings[k];
                if(substring.equals(currentString))
                {
                    currentCount++;
                    if(currentCount >= occurrencesOfLargest && currentString.length() > mostCommon.length())
                    {
                        mostCommon = substring;
                        occurrencesOfLargest = currentCount;
                    }
                }
            }
        }

        return mostCommon;
    }

/**
 * Helper utils
 */

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
