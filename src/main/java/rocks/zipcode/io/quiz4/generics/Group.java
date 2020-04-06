package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> {

    List<T> arrList;

    public Group() {
        try {
            arrList = new ArrayList<>();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Method not yet implemented");
        }
    }

    public Integer count() {
        return arrList.size();
    }

    public void insert(T value) {
        arrList.add(value);
    }

    public Boolean has(T value) {
        return arrList.contains(value);
    }

    public T fetch(int indexOfValue) {
        return arrList.get(indexOfValue);
    }

    public void delete(T value) {
        arrList.remove(value);
    }

    public void clear() {
        arrList.clear();
    }

    public Iterator<T> iterator() {
        return null;
    }
}

