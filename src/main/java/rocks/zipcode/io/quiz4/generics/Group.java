package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>
{
    List<T> listOfTypes;

    public Group()
    {
        listOfTypes = new ArrayList<>();
    }

    public Integer count() {
        return listOfTypes.size();
    }

    public void insert(T value)
    {
        listOfTypes.add(value);
    }

    public Boolean has(T value)
    {
        return listOfTypes.contains(value);
    }

    public T fetch(int indexOfValue)
    {
        return listOfTypes.get(indexOfValue);
    }

    public void delete(T value)
    {
        listOfTypes.remove(value);
    }

    public void clear()
    {
        listOfTypes.clear();
    }

    public Iterator<T> iterator() {
        return listOfTypes.iterator();
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for(T e : listOfTypes)
        {
            sj.add(e.toString());
        }

        return sj.toString();
    }
}
