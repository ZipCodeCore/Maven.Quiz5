package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>, GroupInterface<_>{

    protected List<_> list;

    public Group() {
        list = new LinkedList<>();
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

    @Override
    public String toString() {
        return "" + list;
    }

    public Iterator<_> iterator() {
        return new Iterator<_>() {
            private int pos = 0;
            @Override
            public boolean hasNext() {
                return pos < list.size();
            }

            @Override
            public _ next() {
                if(hasNext())
                    return list.get(pos++);
                else
                    return null;
            }
        };
    }
}
