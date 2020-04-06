package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>{

    List<T> arrList;

    public Group() {
        arrList = new ArrayList<>();
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
        return arrList.iterator();
    }

    @Override
    public String toString() {
        return "" + arrList;
    }
}

