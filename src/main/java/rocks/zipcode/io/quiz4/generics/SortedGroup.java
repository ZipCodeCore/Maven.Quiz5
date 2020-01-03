package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> implements GroupInterface<T> {

    private List<T> sorted = new ArrayList<>();

    public void insert(T string) {
        sorted.add(string);
    }

    public void delete(T valueToInsert) {
       sorted.remove(valueToInsert);
    }

    public Integer indexOf(T value) {
        Collections.sort(sorted);
        return sorted.indexOf(value);
    }
}
