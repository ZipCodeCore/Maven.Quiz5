package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {
    private List<T> myList;
    public SortedGroup(){
        this.myList = new ArrayList<>();
    }
    @Override
    public void insert(T value) {
        myList.add(value);
        Collections.sort(myList);
    }

    @Override
    public void delete(T value) {
        myList.remove(value);
        Collections.sort(myList);
    }

    public Integer indexOf(T value) {
        return myList.indexOf(value);
    }
}
