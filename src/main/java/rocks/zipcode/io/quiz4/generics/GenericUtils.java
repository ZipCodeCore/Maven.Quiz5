package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable<T>> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        List<T> S = new ArrayList<>(originalSet);
        long N = (long)Math.pow(2, originalSet.size());
        ComparableTreeSet<ComparableTreeSet<T>> output = new ComparableTreeSet<>();
        for (int i = 0; i < N; i++) {
            ComparableTreeSet<T> inner = new ComparableTreeSet<>();
            for (int k = 0; k < S.size(); k++) {
                if ((i & (1 << k)) != 0) {
                    inner.add(S.get(k));
                }
                if (inner.size() > 0) {
                    output.add(inner);
                }
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

