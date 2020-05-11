package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    List<String> result = new ArrayList<>();

    public SimpleStringGroup() {
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
    public Iterator<String> iterator() {
        return result.iterator();
    }
}
