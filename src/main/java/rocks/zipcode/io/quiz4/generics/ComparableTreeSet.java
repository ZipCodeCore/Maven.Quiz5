package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet implements Comparable<_>{

    Group<_> myList;

    public ComparableTreeSet(_... arr) {
        myList = new Group<>();
        _[] input = arr.clone();
        Stream.of(input).forEach(s -> {
            if(!myList.has(s)){
                myList.insert(s);
            }
        });
    }


    public ComparableTreeSet() {
        myList = new Group<>();
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(_ o) {
        return 0;
    }

    @Override
    public String toString() {
        _[] arr = (_[]) myList.list.toArray();
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
