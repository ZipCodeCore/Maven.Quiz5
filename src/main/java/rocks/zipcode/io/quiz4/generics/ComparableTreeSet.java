package rocks.zipcode.io.quiz4.generics;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet implements Comparable<_> {
    _ []  arr;
    Set<_> set = new TreeSet<>();


    public ComparableTreeSet(_... arr) {
        this.arr=arr;
        set.addAll(Arrays.asList(arr));



    }


    public ComparableTreeSet() {
       Arrays.sort(arr);
    }

    public int compareTo(ComparableTreeSet<_> o) {
        final int aSize = this.size();
        final int bSize = o.size();
        // No overflow since both >= 0.
        int cmp = aSize - bSize;
        if (cmp != 0) {
            return cmp;
        }
        final Iterator<_> aIt = this.iterator();
        final Iterator<_> bIt = o.iterator();
        for (int i = 0; i < aSize; i++) {
            final _ av = aIt.next();
            final _ bv = bIt.next();

            if (cmp != 0) {
                return cmp;
            }
        }
        return 0;
    }

    @Override
    public int compareTo(_ o) {
     Arrays.equals(arr, (Object[]) o);

        return 0;
    }

    @Override
    public String toString() {

        return set.toString();
    }
}


