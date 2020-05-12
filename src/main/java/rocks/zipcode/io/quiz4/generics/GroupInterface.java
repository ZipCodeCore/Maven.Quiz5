package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public interface GroupInterface<E> extends Iterable<E> {
    Integer count();
    Boolean has(E valueToInsert);
    E fetch(int indexOfValue);
    void insert(E string);
    void delete(E valueToInsert);
    void clear();
}

