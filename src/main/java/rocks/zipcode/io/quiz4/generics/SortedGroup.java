package rocks.zipcode.io.quiz4.generics;

import java.util.Comparator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    @Override
    public void insert(_ value) {
        list.add(value);
        list.sort(new Comparator<_>() {
            @Override
            public int compare(_ o1, _ o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
        list.sort(new Comparator<_>() {
            @Override
            public int compare(_ o1, _ o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }
}
