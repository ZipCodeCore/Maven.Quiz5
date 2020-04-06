package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util. *;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>{
    List<_> groupList;

    public Group() {
        groupList = new ArrayList<>();

    }

    public Integer count() {
        return groupList.size();
    }

    public void insert(Object value) {
        groupList.add((_) value);
    }

    public Boolean has(Object value) {
        return groupList.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return groupList.get(indexOfValue);
    }

    public void delete(Object value) {
        groupList.remove(value);
    }

    public void clear() {
        groupList.clear();
    }

    public Iterator<_> iterator() {
        return groupList.iterator();
    }


}
