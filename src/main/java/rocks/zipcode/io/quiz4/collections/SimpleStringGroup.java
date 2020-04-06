package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup<T> implements Iterable<T> {

    List<String> simpleList;

    public SimpleStringGroup() {
        simpleList = new ArrayList<>();
    }

    public Integer count() {
        return simpleList.size();
    }

    public void insert(String string) {
        simpleList.add(string);
    }

    public Boolean has(String string) {
        return simpleList.contains(string);
    }

    public String fetch(int indexOfValue) {
        return simpleList.get(indexOfValue);
    }

    public void delete(String string) {
        simpleList.remove(string);
    }

    public void clear() {
        simpleList.clear();
    }


    @Override
    public Iterator iterator() {
        return simpleList.iterator();
    }


}
