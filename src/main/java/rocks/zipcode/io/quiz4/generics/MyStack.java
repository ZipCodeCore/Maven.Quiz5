package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    private Stack<SomeType> myStack;

    public MyStack() {
        myStack = new Stack();
    }

    public Boolean isEmpty() {

        return myStack.isEmpty();
        }

        public void push (SomeType i) {
            myStack.add(i);
        }

        public SomeType peek () {
            if (myStack.isEmpty()) {
                return null;
            } else {
                return myStack.peek();
            }
        }
        public SomeType pop () {
            return myStack.pop();
        }


        @Override
        public Iterator<SomeType> iterator ( ) {
            return myStack.iterator();
        }


    }




