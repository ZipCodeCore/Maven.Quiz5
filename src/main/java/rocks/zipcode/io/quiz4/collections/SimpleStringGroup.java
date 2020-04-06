package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    List<String> stringList;
    public SimpleStringGroup() {
        this.stringList = new ArrayList<>();

    }

    public Integer count() {

        return this.stringList.size();
    }

    public void insert(String string) {
        stringList.add(string);
    }

    public Boolean has(String string) {

        return this.stringList.contains(string);
    }

    public String fetch(int indexOfValue) {

        return this.stringList.get(indexOfValue);
    }

    public void delete(String string) {
        this.stringList.remove(string);
    }

    public void clear() {
        this.stringList.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return this.stringList.iterator();
    }
}
