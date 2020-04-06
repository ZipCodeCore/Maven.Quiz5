package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {
        Set <Set<_>> power = new LinkedHashSet<>();
        List<_> origList = new ArrayList<_>(originalSet);
        for (int i = 0;i<origList.size();i++){
            for (int j = i;j<origList.size();j++){
                Set<_> tempSet = new LinkedHashSet<>();
                for (int k = i;k<=j;k++){
                   tempSet.add(origList.get(k));
                }
               power.add(tempSet);
            }
        }
        power.add(new LinkedHashSet<_>(){});
        return power;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

