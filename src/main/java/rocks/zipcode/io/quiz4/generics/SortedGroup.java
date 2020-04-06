package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T>  {
    private List<T> list;

    public SortedGroup(){
        list = new ArrayList<>();
    }

    @Override
    public void insert(T value) {
        list.add(value);
        Collections.sort(list);
    }

    @Override
    public void delete(T value) {
        list.remove(value);
    }

    public Integer indexOf(T value) {

        return list.indexOf(value);
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

