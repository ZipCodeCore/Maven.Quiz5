package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable<_>> extends Group<_> {

    List<_> arrayList = new ArrayList<>();

    @Override
    public void insert(_ value) {
        arrayList.add(value);
        arrayList = arrayList
                .stream()
                .sorted(Comparable::compareTo)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(_ value) {
        arrayList.remove(value);
    }

    public Integer indexOf(_ value) {
        return arrayList.indexOf(value);
    }
}
