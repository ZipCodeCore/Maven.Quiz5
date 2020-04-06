package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {

    @Override
    public void insert(T value) {
       this.list.add(value);
       Collections.sort(this.list);
    }

    @Override
    public void delete(T value) {
        this.list.remove(value);
        Collections.sort(this.list);
    }

    public Integer indexOf(T value) {
        int iter = 0;
        for (T t : this.list) {
            if (t.equals(value)) { return iter; }
            iter++;
        }
        return -1;
    }
}
