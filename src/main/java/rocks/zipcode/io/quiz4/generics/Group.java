package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>, GroupInterface<_> {

    private List<_> arrayList;

    public Group() {
        this.arrayList = new ArrayList<>();
    }

    public Integer count() {
        return arrayList.size();
    }

    public void insert(_ value) {
        arrayList.add(value);
    }

    public Boolean has(_ value) {
        return arrayList.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return arrayList.get(indexOfValue);
    }

    public void delete(_ value) {
        arrayList.remove(value);
    }

    public void clear() {
        arrayList.clear();
    }

    @Override
    public Iterator<_> iterator() {
        return arrayList.iterator();
    }

    @Override
    public void forEach(Consumer<? super _> action) {
        for (_ type : arrayList) {
            action.accept(type);
        }
    }

    @Override
    public String toString() {
        return "" + arrayList;
    }
}
