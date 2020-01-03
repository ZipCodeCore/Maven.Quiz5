package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface{

    ArrayList<_> result = new ArrayList<>();

    public Group() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return result.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return result.contains(valueToInsert);
    }

    public _ fetch(int indexOfValue) {
        return result.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        result.add((_) string);
    }

    @Override
    public void delete(Object valueToInsert) {
        result.remove(valueToInsert);
    }

    public void clear() {
        result.clear();
    }

    public Iterator<_> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public String toString() {
        return result.toString();
    }
}
