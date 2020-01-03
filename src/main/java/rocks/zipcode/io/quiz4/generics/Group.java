package rocks.zipcode.io.quiz4.generics;

import com.sun.javafx.UnmodifiableArrayList;
import javafx.collections.transformation.SortedList;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface<_> {
    private List<_> resultGroup;

    public Group() {
        resultGroup = new ArrayList<_>();
    }

    public Integer count() {
        return resultGroup.size();
    }

    public void insert(_ value) {
        resultGroup.add(value);
    }

    public Boolean has(_ value) {
        if(resultGroup.contains(value)){
            return true;
        }
        return false;
    }

    public _ fetch(int indexOfValue) {
        return resultGroup.get(indexOfValue);
    }

    public void delete(_ value) {
        resultGroup.remove(value);
    }

    public void clear() {
        resultGroup.clear();
    }

    public Iterator<_> iterator() {
        return resultGroup.iterator();
    }
}
