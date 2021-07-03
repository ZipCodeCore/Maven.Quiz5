package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet implements Comparable<_>{
    TreeSet<_> mySet;
    Group<_> myList;

    public ComparableTreeSet(_... arr) {
        _[] myArr = arr;
        Arrays.sort(myArr);
        mySet = new TreeSet<_>(Arrays.asList(myArr));
    }

    public ComparableTreeSet() {
        mySet = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return Integer.valueOf(mySet.first().toString().compareTo(o.mySet.first().toString()));
    }

    @Override
    public int compareTo(_ o) {
        return 0;
    }

    @Override
    public String toString() {
        _[] arr = (_[]) mySet.toArray();
        Arrays.sort(arr);
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                builder.append(arr[i])
                        .append("]");
            }
            else builder.append(arr[i])
                    .append(", ");
        }
        return builder.toString();
    }
}
