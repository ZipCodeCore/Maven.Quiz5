package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {
    public List resultSort;

    public SortedGroup() {
        resultSort = new ArrayList<_>();
    }

    @Override
    public void insert(_ value) {
        this.resultSort.add(value);
        this.resultSort.sort((object1 ,object2)->{if (object1 instanceof Comparable) {
            return ((Comparable)object1).compareTo(object2);
        }
        else return 0;});
    }

    @Override
    public void delete(_ value) {
        resultSort.remove(value);
    }

    public Integer indexOf(_ value) {
        return resultSort.indexOf(value);
    }
}
