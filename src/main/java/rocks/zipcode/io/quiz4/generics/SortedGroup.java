package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T>
{
    @Override
    public void insert(T value)
    {
        listOfTypes.add(value);
        Collections.sort(listOfTypes);
    }

    @Override
    public void delete(T value)
    {
        listOfTypes.remove(value);
    }

    public Integer indexOf(T value)
    {
        return listOfTypes.indexOf(value);
    }
}
