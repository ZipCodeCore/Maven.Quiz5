package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {

    @Override
    public void insert(T value) {
        arrList.add(value);
        Collections.sort(arrList);
    }

    @Override
    public void delete(T value) {
        arrList.remove(value);
    }

    public Integer indexOf(T value) {
        return arrList.indexOf(value);
    }
}
