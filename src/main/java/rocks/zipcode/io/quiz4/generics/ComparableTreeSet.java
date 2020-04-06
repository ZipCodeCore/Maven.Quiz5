package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_ extends Comparable> implements Iterable<_>, Comparable {
    TreeSet<_> treeSet = new TreeSet<>();

    public ComparableTreeSet(_... arr) {
        this.treeSet.addAll(Arrays.asList(arr));
    }

    public ComparableTreeSet() {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int compareTo(ComparableTreeSet<_> o) {
        int lowest = 0;
        for (_ element :treeSet){
            int counter = 0;
            for(_ element2 : o) {
                if (element.compareTo(element2)>0){
                    counter++;
                } else if (element.compareTo(element2) <0){
                    counter --;
                }
            }
            lowest = counter;
        }
        if (lowest == 0){
            return 0;
        }
        if (lowest == -2||lowest>0){
            return 1;
        }
        if (lowest == -3){
            return -1;
        }
        return Integer.valueOf(null);
    }

    @Override
    public Iterator<_> iterator() {
        return treeSet.iterator();
    }

    @Override
    public void forEach(Consumer<? super _> action) {
        Objects.requireNonNull(action);
        Iterator<_> var2 = this.treeSet.iterator();

        while (var2.hasNext()) {
            _ t = var2.next();
            action.accept(t);
        }
    }

    @Override
    public Spliterator<_> spliterator() {
        return null;
    }

    public TreeSet<_> getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(TreeSet<_> treeSet) {
        this.treeSet = treeSet;
    }
}
