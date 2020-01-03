package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {
    ArrayList<String> result = new ArrayList<>();

    public SimpleStringGroup() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return result.size();
    }

    public void insert(String string) {
        result.add(string);
    }

    public Boolean has(String string) {
        return result.contains(string);
    }

    public String fetch(int indexOfValue) {
        return result.get(indexOfValue);
    }

    public void delete(String string) {
        result.remove(string);
    }

    public void clear() {
        result.clear();
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

}
