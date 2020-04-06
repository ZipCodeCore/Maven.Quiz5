package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{
    List<String> strList;
    public SimpleStringGroup() {
        strList = new ArrayList<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return strList.size();
    }

    public void insert(String string) {
        strList.add(string);
    }


    public Boolean has(String string) {

        return strList.contains(string);
    }

    public String fetch(int indexOfValue) {

        return strList.get(indexOfValue);
    }

    public void delete(String string) {
        strList.remove(string);
    }

    public void clear() {
        strList.clear();
    }

    @Override
    public Iterator iterator() {
        return strList.iterator();
    }
}
