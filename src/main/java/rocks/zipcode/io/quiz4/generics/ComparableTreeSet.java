package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<T extends Comparable<T>> extends TreeSet<T> implements Comparable<ComparableTreeSet<T>>{

    Set<T> treeSet;

    public ComparableTreeSet(T... arr) {
        this.treeSet = new TreeSet<>(Arrays.asList(arr));
    }

    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<T> o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public String toString() {
        return "" + treeSet;
    }
}
