package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable<ComparableTreeSet<T>>{
    private TreeSet<T> ts;

    public ComparableTreeSet(T... arr) {
        ts = new TreeSet<>();
    }


    public ComparableTreeSet() {
    }

    public TreeSet<T> getSet(){
        return ts;
    }

    public int compareTo(ComparableTreeSet<T> o) {
        return Integer.valueOf(null);
    }
}
