package rocks.zipcode.io.quiz4.generics;

import java.util.Comparator;
import java.util.List;

public class EmmaListComp<E> implements Comparator<E> {
    @Override
    @SuppressWarnings("unchecked")
    public int compare(E o1, E o2) {
        if(o1 instanceof List && o2 instanceof List){
            List<E> list1 = (List<E>) o1;
            List<E> list2 = (List<E>) o2;
            if(list1.size()==0 && list2.size()==0){
                return 0;
            } else if (list1.size() == 0) {
                return 1;
            }
            else if(list2.size()==0){
                return -1;
            }
            else {
                if(!list1.get(0).equals(list2.get(0))){
                    return ((Comparable<E>)list1.get(0)).compareTo(list2.get(0));
                }
                else {
                    return Integer.compare(list2.size(), list1.size());
                }
            }
        }
        return 0;
    }
}
