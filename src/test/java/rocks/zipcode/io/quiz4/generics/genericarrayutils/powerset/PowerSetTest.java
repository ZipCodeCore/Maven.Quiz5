package rocks.zipcode.io.quiz4.generics.genericarrayutils.powerset;

import org.junit.Assert;
import rocks.zipcode.io.quiz4.generics.GenericUtils;

import java.util.Arrays;

/**
 * @author leon on 15/12/2018.
 */
public class PowerSetTest {
    public static void test(String[] input, String expectedString) {
        // given

        // when
        Iterable<? extends Iterable<? extends String>> actualSet = GenericUtils.powerSet(input);
        String actualString = actualSet.toString();

        char[] tempArray = actualString.toCharArray();
        Arrays.sort(tempArray);
        char[] tempArray2 = expectedString.toCharArray();
        Arrays.sort(tempArray2);

        // then
        Assert.assertEquals(String.valueOf(tempArray2), String.valueOf(tempArray));
    }
}
