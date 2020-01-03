package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{
    ArrayList<String> list = new ArrayList<>();
    public SimpleStringGroup() {

    }

    public Integer count() {
        return list.size();
    }

    public void insert(String string) {
        list.add(string);
    }

    public Boolean has(String string) {
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).equals(string)){
                return true;
            }
        }

        return false;
    }

    public String fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(String string) {
        list.remove(string);

    }

    public void clear() {
        list.clear();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
