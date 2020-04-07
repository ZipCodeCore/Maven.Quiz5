package rocks.zipcode.io.quiz4.collections;

import java.util.*;
import java.util.function.Consumer;


/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String>{
    private List<String> ssgList;
    public SimpleStringGroup() {
        ssgList = new ArrayList<>();
    }

    public Integer count() {
        return ssgList.size();
    }

    public void insert(String string) {
        ssgList.add(string);
    }

    public Boolean has(String string) {

        return ssgList.contains(string);
    }

    public String fetch(int indexOfValue) {

        return ssgList.get(indexOfValue);
    }

    public void delete(String string) {
        ssgList.remove(string);
    }

    public void clear() {
        ssgList.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return ssgList.iterator();
    }


}
