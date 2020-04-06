package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet implements Comparable {

    private Set<_> treeSet = new TreeSet<>();

    public ComparableTreeSet(_... arr) {
        treeSet.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return treeSet.toString();
    }
}
