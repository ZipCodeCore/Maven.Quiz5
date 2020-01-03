package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>,Iterable<T>{

    List<T> result = new ArrayList<>();

    public Group() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return result.size();
    }

    public Boolean has(T valueToInsert) {
        return result.contains(valueToInsert);
    }

    public T fetch(int indexOfValue) {
        return result.get(indexOfValue);
    }


    public void insert(T string) {
        result.add(string);
    }

    public void delete(T valueToInsert) {
        result.remove(valueToInsert);
    }

    public void clear() {
        result.clear();
    }

    public Iterator<T> iterator() {
        return this.result.iterator();
    }


    @Override
    public String toString() {
        return result.toString();
    }
}
