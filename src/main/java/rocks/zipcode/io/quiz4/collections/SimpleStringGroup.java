package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    List<String> stringGroup = new ArrayList<>();
    String string;

    public SimpleStringGroup() {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        stringGroup.add(string);
        return stringGroup.size();
    }

    public void insert(String string) {
    }

    public Boolean has(String string) {
        return null;
    }

    public String fetch(int indexOfValue) {
        return null;
    }

    public void delete(String string) {
    }

    public void clear() {
    }
}
