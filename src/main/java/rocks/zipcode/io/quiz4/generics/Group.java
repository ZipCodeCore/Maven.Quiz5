package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> {

    ArrayList<_> result = new ArrayList<>();

    public Group() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {

        return result.size();
    }

    public void insert(_ value) {
        result.add(value);
    }

    public Boolean has(_ value) {
        return result.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return result.get(indexOfValue);
    }

    public void delete(_ value) {
        result.remove(value);
    }

    public void clear() {
        result.clear();
    }

    public Iterator<_> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return result.toString();
    }
}
