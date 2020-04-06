package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {

        long pow_set_size = (long)Math.pow(2, originalSet.size());
        int counter, j;

        Set<List<T>> result = new LinkedHashSet<>();

        ArrayList<T> a = new ArrayList<>(originalSet);

        for(counter = 0; counter < pow_set_size; counter++) {
            List<T> list = new ArrayList<>();
            for(j = 0; j < originalSet.size(); j++) {
                if((counter & (1 << j)) > 0)
                    list.add(a.get(j));
            }
            result.add(list);
        }
        return result;
    }

    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>>powerSet(T[] arr) {
        return powerSet(new TreeSet<>(Arrays.asList(arr)));
        //return null;
    }

}

