package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {

    private ArrayList<String> strList;
    public SimpleStringGroup() {
            this.strList = new ArrayList<>();
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
    public Iterator<String> iterator(){
        return strList.iterator();
    }
}
