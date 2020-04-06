package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<SomeType> implements GroupInterface<SomeType>{
    private List<SomeType> newList;

    public Group() {
        this.newList = new ArrayList<>();
    }

    public Integer count() {
        return newList.size();
    }

    public void insert(SomeType value) {
        newList.add(value);
    }

    public Boolean has(SomeType value) {
        return newList.contains(value);
    }

    public SomeType fetch(int indexOfValue) {
        return newList.get(indexOfValue);
    }

    public void delete(SomeType value) {
        newList.remove(value);
    }

    public void clear() {
        newList.clear();
    }

    public Iterator<SomeType> iterator() {
        return newList.iterator();
    }
}
