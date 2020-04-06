package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    @Override
    public void insert(_ value) {

        list.add(value);
        list.sort(null);
    }

    @Override
    public void delete(_ value) {

        list.remove(value);
    }

    public Integer indexOf(_ value) {

        return list.indexOf(value);
    }
}
