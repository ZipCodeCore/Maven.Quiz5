package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>
{
    Stack<SomeType> stack;
    public MyStack()
    {
        this.stack = new Stack<>();
    }

    public Boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void push(SomeType i)
    {
        stack.push(i);
    }

    public SomeType peek()
    {
        if(stack.size() == 0)
        {
            return null;
        }
        return stack.peek();
    }

    public SomeType pop()
    {
        return stack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return stack.iterator();
    }

    @Override
    public void forEach(Consumer<? super SomeType> action)
    {
        stack.forEach(action);
    }

    @Override
    public Spliterator<SomeType> spliterator()
    {
        return stack.spliterator();
    }
}

// Was this supposed to be a wrapper again, or a fully functional personal implementation?
// The wrapper passes the tests, if it was not meant to be
