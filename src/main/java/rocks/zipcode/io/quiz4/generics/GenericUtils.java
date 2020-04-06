package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        long pow_set_size = (long)Math.pow(2, originalSet.size());
        int counter, j;
        Set<List<T>> result = new LinkedHashSet<>();
        ArrayList<T> a = new ArrayList<>(originalSet);
        for(counter = 0; counter < pow_set_size; counter++) {
            List<T> list = new ArrayList<>();
            for(j = 0; j < originalSet.size(); j++) {
                if((counter & (1 << j)) > 0)
                    list.add(a.get(j));
            }
            result.add(list);
        }
        if(originalSet.size()>2){
            for(List<T> l : only2(result)){
                T temp = l.get(0);
                l.set(0,l.get(1));
                l.set(1,temp);
                result.add(l);
            }
        }

        return result;
    }

    public static <T extends Comparable<T>> Set<List<T>> only2 (Set<List<T>> set){
        Set<List<T>> result = new HashSet<>();
        for(List<T> l:set){
            if(l.size()==2)
                result.add(l);
        }
        return result;

    }

    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>>powerSet(T[] arr) {
        return powerSet(new TreeSet<>(Arrays.asList(arr)));
        //return null;
    }

}

