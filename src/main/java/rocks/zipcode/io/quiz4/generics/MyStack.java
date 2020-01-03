package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable{

    Stack<SomeType> temp = new Stack<>();

    public MyStack() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {

        return temp.isEmpty();
    }

    public void push(SomeType i) {
        temp.push(i);
    }

    public SomeType peek() {

        if (temp.isEmpty()){
            return null;
        } else {
            return temp.peek();
        }
    }

    public SomeType pop() {
        if (temp.isEmpty()){
            throw new EmptyStackException();
        } else {
            return temp.pop();
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }
}
