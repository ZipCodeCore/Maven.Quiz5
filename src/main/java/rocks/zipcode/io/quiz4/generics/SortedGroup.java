package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    private List<_> list;
    public SortedGroup(){
        this.list = new ArrayList<>();
    }
    @Override
    public void insert(_ value) {
        list.add(value);
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }
}
