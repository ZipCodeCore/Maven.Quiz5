package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_> {
    ArrayList<_> _List;

    public Group() {
        this._List = new ArrayList<>();
    }

    public Integer count() {
        return _List.size();
    }

    public void insert(_ _) {
        _List.add(_);
    }

    public Boolean has(_ _) {
        return _List.contains(_);
    }

    public _ fetch(int indexOfValue) {
        return _List.get(indexOfValue);
    }

    public void delete(_ _) {
        _List.remove(_);
    }

    public void clear() {
        _List.clear();
    }


    @Override
    public Iterator<_> iterator() {
        return _List.iterator();
    }

    @Override
    public void forEach(Consumer<? super _> action) {
        Objects.requireNonNull(action);
        Iterator<_> var2 = this._List.iterator();

        while (var2.hasNext()) {
            _ t = var2.next();
            action.accept(t);
        }
        ;
    }

    @Override
    public Spliterator<_> spliterator() {
        return null;
    }
}

