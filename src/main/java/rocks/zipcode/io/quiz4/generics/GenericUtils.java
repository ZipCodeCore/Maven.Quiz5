package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils
{
    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet)
    {
        Set<Set<T>> powSet = new HashSet<>();
        List<T> setAsList = new ArrayList<>(originalSet);
        Integer totalSets = (int) Math.pow(2, setAsList.size());

        for(Integer i = 0; i < totalSets; i++)
        {
            Set<T> subset = new HashSet<>();

            for(Integer k = 0; k < setAsList.size(); k++)
            {
                if ((i & (1 << k)) != 0)
                {
                    subset.add(setAsList.get(k));
                }
            }
            powSet.add(subset);
        }

        return powSet;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet)
    {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

