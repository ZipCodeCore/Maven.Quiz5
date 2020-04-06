package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String>{

    List<String> los;

    public SimpleStringGroup() {
        los = new ArrayList<>();
    }

    public Integer count() {
        return los.size();
    }

    public void insert(String string) {
        los.add(string);
    }

    public Boolean has(String string) {
        if (los.contains(string)) {
            return true;
        }
        return false;
    }

    public String fetch(int indexOfValue) {
        return los.get(indexOfValue);
    }

    public void delete(String string) {
        los.remove(string);
    }

    public void clear() {
        los.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return this.los.iterator();
    }
}
