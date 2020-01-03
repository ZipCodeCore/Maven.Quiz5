package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {
        Set<Set<_>> sets = new LinkedHashSet<>();
        List<_> list = new ArrayList<_>(originalSet);

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size();j++) {

            }
        }

        return sets;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

