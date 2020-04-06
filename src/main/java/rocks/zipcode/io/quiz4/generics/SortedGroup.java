package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    List<_> list = new ArrayList<>();

    @Override
    public void insert(_ value) {

    }

    @Override
    public void delete(_ value) {
    }

    public Integer indexOf(_ value) {
        return (Integer) list.get(indexOf(value));
    }
}
