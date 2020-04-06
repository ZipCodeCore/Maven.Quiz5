package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_> {
    private TreeSet<_> trees= new TreeSet<_>();
    public ComparableTreeSet(_... arr) {

    }


    public ComparableTreeSet() {
        this.trees = trees;
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return Integer.valueOf(0);
    }
}
