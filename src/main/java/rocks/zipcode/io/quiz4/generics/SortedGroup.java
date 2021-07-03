package rocks.zipcode.io.quiz4.generics;


import java.util.Arrays;
import java.util.Collections;


/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable<_>> extends Group<_> {

    public SortedGroup() {
        super();
    }

    @Override
    public void insert(_ value) {
        this.list.add(value);
        Collections.sort(list);
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
    }

    public Integer indexOf(_ value) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == value){
                return i;
            }
        }
        return -1;
    }
}
