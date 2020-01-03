package rocks.zipcode.io.quiz4.generics;

import java.lang.reflect.Array;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<T> implements Iterable<T> {
    private Node<T> head;
//    private T[] stack;
    private Integer currentSize;
    public MyStack() {
        this.currentSize = 0;
        this.head = new Node<T>();//we'll say head has no data
//        this.stack = (T[]) Array.newInstance(this.getClass(), this.currentSize);
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {
        return !this.head.hasNext();
//        return this.stack.length == 0;
    }

    public void push(T i) {
        Node<T> newNode = new Node<>(i);
        this.getLastElement().setNext(newNode);
        this.currentSize += 1;
    }

    public Node<T> getLastElement() {
        Node<T> last = this.head;
        for(Node<T> node = last.getNext(); node != null; node = node.getNext()) {
            last = node;
        }
        return last;
    }

    public Node<T> getNode(Integer index) {
        int count = 0;
        for (Node<T> node = this.head; node.hasNext(); node = node.getNext()) {
            if (index.equals(count)) return node;
            count++;
        }
        return null;
    }

    public T peek() {
        return getLastElement().getData();
    }

    public T pop() {
        if (this.currentSize == 0) {
            throw new EmptyStackException();
        } else {
            T item = this.getLastElement().getData();
            for (Node<T> node = this.head; node.hasNext(); node = node.getNext()) {
                if (!node.getNext().hasNext()) {
                    node.setNext(null);
                    this.currentSize -= 1;
                    break;
                }
            }
            return item;
        }
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return (currentIndex < currentSize && getNode(currentIndex).hasNext());
            }

            @Override
            public T next() {
                return getNode(currentIndex+1).getData();
            }
        };
        return iterator;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;

        private Node() {

        }

        private Node (T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Boolean hasNext() {
            return this.getNext() != null;
        }

    }
}
