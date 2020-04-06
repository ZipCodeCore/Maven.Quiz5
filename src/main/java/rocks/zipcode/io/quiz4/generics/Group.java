package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<SomeType> implements Iterable, GroupInterface {
    List<SomeType> list;

    public Group(List list) {
        this.list = list;
    }

    public Group() {
        this.list = new ArrayList<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return list.contains(valueToInsert);
    }

    @Override
    public Object fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        list.add((SomeType)string);

    }

    @Override
    public void delete(Object valueToInsert) {
        list.remove(valueToInsert);

    }

    public Integer count() {
        return list.size();
    }



    public void clear() {
        list.clear();
    }

    public Iterator<SomeType> iterator() {
        return list.iterator();
    }
}
