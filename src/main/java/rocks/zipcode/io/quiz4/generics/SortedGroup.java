package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    List<_> result = new ArrayList<>();
    @Override
    public void insert(_ value) {
        result.add(value);
    }

    @Override
    public void delete(_ value) {
        result.remove(value);
    }

    public Integer indexOf(_ value) {
        return result.indexOf(value);
    }
}
