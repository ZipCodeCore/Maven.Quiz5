package rocks.zipcode.io.quiz4.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String>{

    private List<String> str;

    public SimpleStringGroup() {
        str = new LinkedList<>();
    }

    public Integer count() {
        return str.size();
    }

    public void insert(String string) {
        str.add(string);
    }

    public Boolean has(String string) {
        return str.contains(string);
    }

    public String fetch(int indexOfValue) {
        return str.get(indexOfValue);
    }

    public void delete(String string) {
        str.remove(string);
    }

    public void clear() {
        str.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int pos = 0;
            @Override
            public boolean hasNext() {
                if(pos < str.size())
                    return true;
                return false;
            }

            @Override
            public String next() {
                if(hasNext())
                    str.get(pos++);
                return null;
            }
        };
    }
}
