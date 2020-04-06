package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<E> implements Comparable<E> {
        Set<E> newSet = new TreeSet<>();
    public ComparableTreeSet(E... arr) {
        newSet.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<E> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(E o) {
        return 0;
    }
}
