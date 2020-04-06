package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    private Stack newStack;

    public MyStack() {
        this.newStack = new Stack();
    }

    public Boolean isEmpty() {
        return newStack.isEmpty();
    }

    public void push(SomeType i) {
        newStack.push(i);
    }

    public SomeType peek() {
        if (isEmpty()){
            return null;
        }
        return (SomeType) newStack.peek();
    }

    public SomeType pop() {
        return (SomeType) newStack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
