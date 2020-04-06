package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {

    List<String> los;

    public SimpleStringGroup() {
        try {
            los = new ArrayList<>();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Method not yet implemented");
        }
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
}
