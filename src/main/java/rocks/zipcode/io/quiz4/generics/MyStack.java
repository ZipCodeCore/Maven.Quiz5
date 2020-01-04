package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{
    Stack<SomeType>stack ;

    public MyStack() {
        stack = new Stack<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.push(i);
        i = stack.peek();

    }

    public SomeType peek() {
        if(stack.isEmpty())
        throw new UnsupportedOperationException("Method not yet implemented");
        else
        return stack.peek();
    }

    public SomeType pop() {
        return stack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
