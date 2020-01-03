package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    private ArrayList<_> listOfValues = new ArrayList<>();
    @Override
    public void insert(_ value) {
        listOfValues.add(value);
    }

    @Override
    public void delete(_ value) {
        listOfValues.remove(value);
    }

    public Integer indexOf(_ value) {

        for (int i =0; i < listOfValues.size(); i++){
            if (listOfValues.get(i).equals(value)){
                return i;
            }
        }
            return -1;
    }
}
