package rocks.zipcode.io.quiz4.collections;

import rocks.zipcode.io.quiz4.generics.Group;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {

    ArrayList<String> stringList;

    public SimpleStringGroup() {
        this.stringList = new ArrayList<>();
    }

    public Integer count() {
        return stringList.size();
    }

    public void insert(String string) {
        stringList.add(string);
    }

    public Boolean has(String string) {
        return stringList.contains(string);
    }

    public String fetch(int indexOfValue) {
        return stringList.get(indexOfValue);
    }

    public void delete(String string) {
        stringList.remove(string);
    }

    public void clear() {
        stringList.clear();
    }

    public Iterator<String> iterator() {
        return null;
    }
}
