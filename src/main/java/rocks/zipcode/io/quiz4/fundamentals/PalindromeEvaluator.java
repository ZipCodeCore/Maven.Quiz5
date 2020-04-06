package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {


    public static String[] getAllPalindromes(String string) {
        String res = "";
        {
        TreeMap<String, Integer> m = new TreeMap<>();
        int n = string.length();


        int[][] R = new int[2][n + 1];


        string = "@" + string + "#";

        for (int j = 0; j <= 1; j++) {
            int rp = 0;   // length of 'palindrome radius'
            R[j][0] = 0;

            int i = 1;
            while (i <= n) {

                while (string.charAt(i - rp - 1) == string.charAt(i +
                        j + rp))
                    rp++;

                R[j][i] = rp;
                int k = 1;
                while ((R[j][i - k] != rp - k) && (k < rp)) {
                    R[j][i + k] = Math.min(R[j][i - k],
                            rp - k);
                    k++;
                }
                rp = Math.max(rp - k, 0);
                i += k;
            }
        }


        string = string.substring(1, string.length() - 1);


        m.put(string.substring(0, 1), 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= 1; j++)
                for (int rp = R[j][i]; rp > 0; rp--)
                    m.put(string.substring(i - rp - 1, i - rp - 1
                            + 2 * rp + j), 1);
            m.put(string.substring(i, i + 1), 1);
        }


        for (Map.Entry<String, Integer> ii : m.entrySet())
            res += ii.getKey() + ",";
    }

        String [] result = res.split(",");

        return result;
    }



    public static Boolean isPalindrome(String string) {
      StringBuilder reverse = new StringBuilder(string);
      reverse.reverse();
      if (string.equals(String.valueOf(reverse))){
          return true;
      }

        return false;
    }

    public static String reverseString(String string) {
        StringBuilder reverse = new StringBuilder(string);

        return String.valueOf(reverse.reverse());

    }
}
