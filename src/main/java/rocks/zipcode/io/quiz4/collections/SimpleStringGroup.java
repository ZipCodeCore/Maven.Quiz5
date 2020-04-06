package rocks.zipcode.io.quiz4.collections;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    ArrayList<String> stringList;
    public SimpleStringGroup() {
        this.stringList = new ArrayList<>();
    }

    public Integer count() {
        return stringList.size();
    }

    public void insert(String string) {
        stringList.add(string);
    }

    public Boolean has(String string) {
        return stringList.contains(string);
    }

    public String fetch(int indexOfValue) {
        return stringList.get(indexOfValue);
    }

    public void delete(String string) {
        stringList.remove(string);
    }

    public void clear() {
        stringList.clear();
    }


    @Override
    public Iterator<String> iterator() {
        return stringList.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
         Objects.requireNonNull(action);
        Iterator<String> var2 = this.stringList.iterator();

        while(var2.hasNext()) {
            String t = var2.next();
            action.accept(t);
        };
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
