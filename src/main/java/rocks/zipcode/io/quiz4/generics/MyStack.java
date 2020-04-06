package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{
    private int top;
    private SomeType[] elements;
    private final int INITIAL_SIZE = 10;
    public MyStack() {
        elements = (SomeType[]) new Object[INITIAL_SIZE];
        top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public void push(SomeType i) {

        elements[++top] = i;
    }

    public SomeType peek() {
        if(isEmpty()){
            return null;
        }
        return elements[top];
    }

    public SomeType pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elements[top--];
    }

    private void expandSize(){
        int increasedSize = elements.length*2;
        elements = Arrays.copyOf(elements, increasedSize);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {

    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return null;
    }


}
