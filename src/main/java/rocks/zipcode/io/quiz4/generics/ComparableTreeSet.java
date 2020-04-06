package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T extends Comparable<T>> extends TreeSet<String> implements Comparable<ComparableTreeSet<T>> {
    Set<T> set;

    public ComparableTreeSet() {
        set = new TreeSet<>();
    }

    public ComparableTreeSet( T ... arr){
        set = new TreeSet<>();
        Collections.addAll(set, arr);
    }

    @Override
    public int compareTo(ComparableTreeSet<T> o) {
        if(set.size()-o.set.size() != 0)
            return set.size()-o.set.size();
        else
            return set.toString().compareTo(o.toString());
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
