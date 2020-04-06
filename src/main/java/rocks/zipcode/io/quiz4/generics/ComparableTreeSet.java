package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.logging.*;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable<T> {

    private TreeSet<T> treehouse;

    public ComparableTreeSet(T... arr) {
        this.treehouse = new TreeSet<>();
        for (T t : arr) {
            if (t instanceof ComparableTreeSet) {
                this.treehouse.addAll(((ComparableTreeSet) t).getTree());
            } else {
                this.treehouse.addAll(Arrays.asList(arr));
            }
        }
        this.clear();
        this.addAll(treehouse);
    }


    public ComparableTreeSet() { this.treehouse = new TreeSet<>(); }

    private TreeSet<T> getTree() {
        return treehouse;
    }

    public int compareTo(ComparableTreeSet<T> o) {
        TreeSet<T> power = new TreeSet();
        power.addAll(this.getTree());
        power.addAll(o.getTree());
        if (power.size() < 1) { return 0; }
        Iterator<T> iter = power.descendingIterator();
        T curr = iter.next();
        boolean keep = true;
        int output = 0;
        while (curr != null && keep) {
            if (this.contains(curr) && o.contains(curr)) { output = 0; }
            else if (this.contains(curr)) { output = -1; }
            else if (o.contains(curr)) { output = 1; }
            if (iter.hasNext()) {
                curr = iter.next();
            } else {
                keep = false;
            }
        }
        return output;
    }

    @Override
    public int compareTo(T o) {
        Logger.getGlobal().warning("im not sure what ive just been tested on");
        return -5;
    }

    @Override
    public String toString() {
        String output = "[";
        if (treehouse.size() > 0) {
            for (T t : treehouse) {
                output += t + ", ";
            }
            output = output.substring(0, output.length() - 2);
        }
        output += "]";
        return output;
    }
}
