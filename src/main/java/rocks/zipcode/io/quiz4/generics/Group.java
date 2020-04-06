package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T> {

    protected List<T> list;

    public Group() {
        list = new ArrayList<>();
    }

    @Override
    public Integer count() {
        return list.size();
    }

    @Override
    public void insert(T value) {
        this.list.add(value);
    }

    @Override
    public Boolean has(T value) {
        return this.list.contains(value);
    }

    @Override
    public T fetch(int indexOfValue) {
        return this.list.get(indexOfValue);
    }

    @Override
    public void delete(T value) {
        this.list.remove(value);
    }

    @Override
    public void clear() {
        this.list.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        String output = "[";
        for (T t : this.list) {
            output += t.toString() + ", ";
        }
        if (list.size() > 0) { output = output.substring(0, output.length() - 2); }
        output += "]";
        return this.list.size() > 0 ? output : "[]";
    }
}
