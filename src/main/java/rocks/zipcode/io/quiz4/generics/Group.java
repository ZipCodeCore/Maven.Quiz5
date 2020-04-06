package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>{
    private List<T> list;

    public Group() {
        list = new ArrayList<>();
    }

    public Integer count() {

        return list.size();
    }

    public void insert(T value) {
        list.add(value);
    }

    public Boolean has(T value) {

        return list.contains(value);
    }

    public T fetch(int indexOfValue) {

        return list.get(indexOfValue);
    }

    public void delete(T value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (T e : list){
            sb.append(e.toString()).append(", ");
        }
        String s = sb.toString().substring(0,sb.length()-2);
        return s + "]";
    }
}
