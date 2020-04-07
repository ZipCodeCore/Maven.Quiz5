package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable<T>{


    @SafeVarargs
    public ComparableTreeSet(T... arr) {
        super();
        addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
        super();
    }


    @SuppressWarnings("unchecked")
    public int compareTo(ComparableTreeSet<T> o) {
        ArrayList<T> arrayList1 = new ArrayList<>(this);
        ArrayList<T> arrayList2 = new ArrayList<>(o);

        for (int i = 0; i < arrayList1.size(); i++) {
            Comparable<T> compareElement = (Comparable<T>) arrayList1.get(i);
            int counterpart = compareElement.compareTo(arrayList2.get(i));
            if(counterpart!=0){
                return counterpart;
            }
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int compareTo(Object o) {
        if(o instanceof ComparableTreeSet){
            return compareTo((ComparableTreeSet<T>) o);
        }
        return 0;
    }


}
