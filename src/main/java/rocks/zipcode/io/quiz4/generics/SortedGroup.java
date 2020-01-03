package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {
    @Override
    public void insert(_ value) {
        if(list.isEmpty()){
            list.add(value);
        }
        else {
            int counter = 0;
            while (list.get(counter).compareTo(value) < 1) {
                counter++;
            }
            list.add(counter, value);
        }
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }
}
