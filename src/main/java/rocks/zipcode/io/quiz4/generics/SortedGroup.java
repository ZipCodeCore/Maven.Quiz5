package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> implements GroupInterface<_>{
    @Override
    public void insert(_ value) {
        this._List.add(value);
    }

    @Override
    public void delete(_ value) {
        this._List.remove(value);
    }

    public Integer indexOf(_ value) {
        return _List.indexOf(value);
    }
}
