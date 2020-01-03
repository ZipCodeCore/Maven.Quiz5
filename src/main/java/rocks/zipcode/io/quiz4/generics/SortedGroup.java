package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    private Set<_> setOfValues = new TreeSet<>();
    private ArrayList<_> listOfValues = new ArrayList<>();

    @Override
    public void insert(_ value) {
        setOfValues.add(value);
    }

    @Override
    public void delete(_ value) {
        setOfValues.remove(value);
    }

    public Integer indexOf(_ value) {
        for (_ g : setOfValues){
            listOfValues.add(g);
        }
        for (int i = 0; i < listOfValues.size(); i++){
            if (listOfValues.get(i).equals(value)){
                return i;
            }
        }
        return -1;
    }
}
