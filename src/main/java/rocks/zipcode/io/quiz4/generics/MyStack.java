package rocks.zipcode.io.quiz4.generics;

import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> {
    Stack<SomeType> theirStack;
    public MyStack(){
        this.theirStack = new Stack<>();
    }

    public Boolean isEmpty() {
        return theirStack.isEmpty();
    }

    public void push(SomeType i) {theirStack.push(i);
    }

    public SomeType peek()
    {
    return theirStack.peek();
    }

    public SomeType pop() {

        return theirStack.pop();
    }
}
