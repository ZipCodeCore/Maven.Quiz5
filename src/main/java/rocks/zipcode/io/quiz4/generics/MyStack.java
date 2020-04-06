package rocks.zipcode.io.quiz4.generics;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    private int stackSize;
    private Node first;

    private class Node {
        private SomeType someType;
        private Node next;
    }


    public MyStack() {
        this.first = null;
        this.stackSize = 0;
    }

    public Boolean isEmpty() {

        return first == null;
    }

    public void push(SomeType i) {

        Node oldFirst = first;
        first = new Node();
        first.someType = i;
        first.next = oldFirst;
        stackSize++;

    }

    public SomeType peek() {

        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.someType;
    }

    public SomeType pop() {

        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        SomeType someType = first.someType;
        first = first.next;
        stackSize--;

        return someType;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
