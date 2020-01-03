package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T>  implements Comparable<T>{

    Set<T> mySet = new TreeSet<>();

    public ComparableTreeSet(T... arr) {
        mySet.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<T> o) {
        return Integer.valueOf(null);
    }

    @Override
    public String toString() {
        return mySet.toString();
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
