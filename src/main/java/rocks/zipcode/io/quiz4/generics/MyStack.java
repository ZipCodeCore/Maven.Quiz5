package rocks.zipcode.io.quiz4.generics;

import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> {

    Stack<SomeType> testStack;

    public MyStack() {
        testStack = new Stack<> ();

        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {

        return testStack.isEmpty ();
    }

    public void push(SomeType i) {
        testStack.push(i);
    }

    public SomeType peek() {
        if (testStack.isEmpty ()) {
            throw new UnsupportedOperationException("Method not yet implemented");
        }else {return testStack.peek ();}

    }

    public SomeType pop() {

        return testStack.pop ();
    }
}
