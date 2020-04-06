package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{
    Stack<SomeType> stack;
    public MyStack() {
        this.stack = new Stack<SomeType>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {

        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
        if(!stack.isEmpty()){
            return null;
        }
        return stack.peek();

    }

    public SomeType pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
