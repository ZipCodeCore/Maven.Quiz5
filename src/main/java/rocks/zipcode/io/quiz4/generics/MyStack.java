package rocks.zipcode.io.quiz4.generics;

import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> {

    Stack<SomeType> stack;

    public MyStack() {
        try {
            stack = new Stack<>();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Method not yet implemented");
        }
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
        try {
            return stack.peek();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Method not yet implemented");
        }
    }

    public SomeType pop() {
        return stack.pop();
    }
}
