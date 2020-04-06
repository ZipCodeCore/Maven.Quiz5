package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String>
{
    private List<String> listOfStrings;

    public SimpleStringGroup() {
        listOfStrings = new ArrayList<>();
    }

    public Integer count() {
        return listOfStrings.size();
    }

    public void insert(String string)
    {
        listOfStrings.add(string);
    }

    public Boolean has(String string)
    {
        return listOfStrings.contains(string);
    }

    public String fetch(int indexOfValue)
    {
        return listOfStrings.get(indexOfValue);
    }

    public void delete(String string)
    {
        listOfStrings.remove(string);
    }

    public void clear()
    {
        listOfStrings.clear();
    }

    @Override
    public Iterator<String> iterator()
    {
        return listOfStrings.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action)
    {
        listOfStrings.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator()
    {
        return listOfStrings.spliterator();
    }
}
