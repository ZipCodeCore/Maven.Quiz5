package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {
    @Override
    public void insert(T value) {
        super.insert(value);
        Collections.sort(super.list);
    }

    @Override
    public void delete(T value) {
        super.delete(value);
        Collections.sort(super.list);
    }

    public Integer indexOf(T value) {
        int i = 0;
        for(T t :super.list){
            if(value.equals(t)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
