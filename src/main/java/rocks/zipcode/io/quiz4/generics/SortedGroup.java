package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    @Override
    public void insert(Object string) {
        super.insert(string);
    }

    @Override
    public void delete(Object valueToInsert) {
        super.delete(valueToInsert);
    }

    public Integer indexOf(_ value) {
        return super.result.indexOf(value);
    }
}
