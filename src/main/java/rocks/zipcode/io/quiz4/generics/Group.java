package rocks.zipcode.io.quiz4.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<E> implements Iterable<E> {
        List<E> myCollection;
    public Group() {
        this.myCollection = new ArrayList<>();
    }

    public Integer count() {

        return myCollection.size();
    }

    public void insert(E value) {
        myCollection.add(value);
    }

    public Boolean has(E value) {

        return myCollection.contains(value);
    }

    public E fetch(int indexOfValue) {

        return myCollection.get(indexOfValue);
    }

    public void delete(E value) {
        myCollection.remove(value);
    }

    public void clear() {
        myCollection.clear();
    }

    public Iterator<E> iterator() {
        return myCollection.iterator();
    }

    @Override
    public String toString(){
        E[] newArray = (E[]) new Array[myCollection.size()];
        int count = 0;
        for(E a : myCollection){
            newArray[count] = a;
            count++;
        }
        return newArray.toString();
    }
}
