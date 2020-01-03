package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>, GroupInterface<_> {
    List<_>list;
    public Group() {
        this.list = new ArrayList<_>() ;{
        }

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
        list = new ArrayList<>();

        }

    public Iterator<_> iterator() {
        return list.listIterator();
    }
}
