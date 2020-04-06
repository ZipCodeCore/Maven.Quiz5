package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<E> implements Comparable<E> {
    private TreeSet<E> newSet;
    public ComparableTreeSet(E... arr) {
        newSet = new TreeSet<>();
        newSet.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
        this.newSet = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<E> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(E o) {
        return 0;
    }
}
