package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    List<String> str;
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

    public void clear() {str.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
