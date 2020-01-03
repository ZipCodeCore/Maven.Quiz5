package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {

    private List<String> group;

    public SimpleStringGroup() {
        this.group = new ArrayList<>();
    }

    public Integer count() {
        return group.size();
    }

    public void insert(String string) {
        group.add(string);
    }

    public Boolean has(String string) {
        for(String s : this.group){
            if(s.equals(string)) return true;
        }
        return false;
    }

    public String fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }

    public void delete(String string) {
        group.remove(string);
    }

    public void clear() {
        group.clear();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
