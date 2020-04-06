package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>, Comparable<SomeType> {
    Stack<SomeType> s = new Stack<>();

    public MyStack(){ }

    public Boolean isEmpty() {
        return s.isEmpty();
    }

    public void push(SomeType i) {
        s.push(i);
    }

    public SomeType peek() {
        if(s.size()==0)
            return null;
        return s.peek();
    }

    public SomeType pop() {
        return s.pop();
    }

    @Override
    public int compareTo(SomeType someType) {
        return 0;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return s.iterator();
    }
}
