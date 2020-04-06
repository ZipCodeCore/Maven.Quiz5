package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet<_> implements Comparable<_>{

    TreeSet<_> set;

    public ComparableTreeSet(_... arr) {
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public int compareTo(_ o) {
        return this.toString().compareTo(o.toString());
    }
}
