package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        List<T> S = new ArrayList<>(originalSet);
        long N = (long)Math.pow(2, originalSet.size());
        Set<TreeSet<T>> output = new HashSet<>();
        for (int i = 0; i < N; i++) {
            TreeSet<T> inner = new TreeSet<>();
            for (int k = 0; k < S.size(); k++) {
                if ((i & (1 << k)) != 0) {
                    inner.add(S.get(k));
                }
                output.add(inner);
            }
        }
        ArrayList<TreeSet<T>> rev = new ArrayList<>(output);
        Collections.reverse(rev);
        LinkedHashSet<Set<T>> realOutput = new LinkedHashSet<>();
        for (TreeSet<T> set : rev) {
            LinkedHashSet<T> toAdd = new LinkedHashSet<>(set);
            realOutput.add(toAdd);
        }
        return realOutput;
    }

    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

