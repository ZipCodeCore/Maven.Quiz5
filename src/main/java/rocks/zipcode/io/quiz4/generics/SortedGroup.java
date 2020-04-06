package rocks.zipcode.io.quiz4.generics;

import java.util.Comparator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    @Override
    public void insert(_ value) {
        list.add(value);
        list.sort(Comparator.comparing(Object::toString));
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
        list.sort(Comparator.comparing(Object::toString));
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }
}
