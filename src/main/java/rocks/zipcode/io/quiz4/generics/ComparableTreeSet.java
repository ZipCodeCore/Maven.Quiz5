package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_ extends Comparable<_>> extends TreeSet<_> implements Comparable<ComparableTreeSet<_>>{

    private TreeSet<_> treeSet = new TreeSet<>();

    public ComparableTreeSet() {
    }

    public ComparableTreeSet(_... arr) {
        treeSet.addAll(Arrays.asList(arr));
    }

    public TreeSet<_> getTreeSet() {
        return treeSet;
    }

    @Override
    public int compareTo(ComparableTreeSet<_> o) {
        return this.toString().compareTo((o.toString()));
    }

    @Override
    public String toString() {
        return treeSet + "";
    }
}
