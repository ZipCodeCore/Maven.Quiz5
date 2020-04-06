package rocks.zipcode.io.quiz4.generics;

import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> {
    private Stack<SomeType> someTypeStack;
    public MyStack() {
        someTypeStack = new Stack<>();
    }

    public Boolean isEmpty() {
        return someTypeStack.isEmpty();
    }

    public void push(SomeType i) {
        someTypeStack.push(i);
    }

    public SomeType peek() {
        if (!someTypeStack.isEmpty()){
            return someTypeStack.peek();
        }
        else {
            return null;
        }
    }

    public SomeType pop() {
        return someTypeStack.pop();
    }
}
