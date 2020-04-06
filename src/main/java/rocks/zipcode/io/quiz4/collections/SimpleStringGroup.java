package rocks.zipcode.io.quiz4.collections;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {

    List<String> s;
    public SimpleStringGroup() {
        super();
       this.s = new ArrayList<>();

    }

    public Integer count() {
        return s.size();
    }

    public void insert(String string) {
        s.add(string);

    }

    public Boolean has(String string) {
        return s.contains(string);
    }

    public String fetch(int indexOfValue) {


        return s.get(indexOfValue);
    }

    public void delete(String string) {
        s.remove(string);
    }

    public void clear() {
        s.clear();

    }




    @Override
    public Iterator iterator() {
        return null;
    }

    public void forEach(Consumer str ) {
        for(String each : s){
            str.accept(each);
        }

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
