package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable{

    private Stack<SomeType> theStack = new Stack<>();
    public MyStack() {

    }

    public Boolean isEmpty() {
        return theStack.isEmpty();
    }

    public void push(SomeType i) {

        theStack.push(i);
    }

    public SomeType peek() {
        if(isEmpty()){
            return null;
        }
        return theStack.peek();
    }

    public SomeType pop() {
        return theStack.pop();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
