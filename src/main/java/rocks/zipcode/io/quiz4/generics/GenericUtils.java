package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {
        List<_> original = new ArrayList<>(originalSet);
        List<List<_>> powerList = new ArrayList<>();
        for (int i = 0; i < original.size(); i++) {
            for (int j = i+1; j <= original.size() ; j++) {
                powerList.add(original.subList(i,j));
            }
        }

        return null;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

