package rocks.zipcode.io.quiz4.collections;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    List<String> asdf;
    public SimpleStringGroup() {
        this.asdf = new ArrayList<>();
    }

    public Integer count() {
        return asdf.size();
    }

    public void insert(String string) { asdf.add(string);
    }

    public Boolean has(String string) {
        return asdf.contains(string);
    }

    public String fetch(int indexOfValue) {
        return asdf.get(indexOfValue);
    }

    public void delete(String string) { asdf.remove(string);
    }

    public void clear() { asdf.clear();
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
