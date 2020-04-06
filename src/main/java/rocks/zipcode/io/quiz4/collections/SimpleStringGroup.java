package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    List<String> stringGroup;

    public SimpleStringGroup() {
        stringGroup = new ArrayList<>();
    }

    public Integer count() {
        return stringGroup.size();
    }

    public void insert(String string) {
        stringGroup.add(string);
    }

    public Boolean has(String string) {
        if (stringGroup.contains(string)){
            return true;
        }
        else {
            return false;
        }
    }

    public String fetch(int indexOfValue) {
        return stringGroup.get(indexOfValue);
    }

    public void delete(String string) {
        stringGroup.remove(string);
    }

    public void clear() {
        stringGroup.clear();
    }
}
