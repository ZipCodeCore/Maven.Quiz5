package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable{

    ArrayList<_> list = new ArrayList<>();
    public Group() {

    }

    public Integer count() {
        return list.size();
    }


    public void insert(_ value) {
        list.add(value);
    }

    public Boolean has(_ value) {
        return list.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }



    public void delete(_ value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<_> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(list.toArray());
    }
}
