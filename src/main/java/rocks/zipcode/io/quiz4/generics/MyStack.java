package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    Deque<SomeType> stack;

    public MyStack() {
        this.stack = new ArrayDeque<>();

    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
        return stack.peek();
    }

    public SomeType pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public Iterator<SomeType> iterator() { return null;}
}
