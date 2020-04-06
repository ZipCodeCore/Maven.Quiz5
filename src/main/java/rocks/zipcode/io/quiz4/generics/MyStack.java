package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {

    private Stack<SomeType> stack;

    public MyStack() {
        this.stack = new Stack<>();
    }

    public Boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void push(SomeType i) {
        this.stack.push(i);
    }

    public SomeType peek() {
       return stack.isEmpty() ? null : stack.peek();
    }

    public SomeType pop() {
        return stack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return stack.iterator();
    }
}
