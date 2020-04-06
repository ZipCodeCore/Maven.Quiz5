package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{

    private List<SomeType> list;
    public MyStack() {



        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {
        return null;
    }

    public void push(SomeType i) {
    }

    public SomeType peek() {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {
        return null;
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
