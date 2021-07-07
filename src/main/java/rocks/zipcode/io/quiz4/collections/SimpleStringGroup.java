package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {
    List<String> str = new ArrayList<>();

    public SimpleStringGroup() {
        this.str = new ArrayList<>();
    }

    public Integer count() {
        return str.size();
    }

    public void insert(String string) {
        str.add(string);

    }

    public Boolean has(String string) {
        return str.contains(string);
    }

    public String fetch(int indexOfValue) {
        return str.get(indexOfValue);
    }

    public void delete(String string) {
        str.remove(string);
    }

    public void clear() {
        str.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return str.iterator();
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
