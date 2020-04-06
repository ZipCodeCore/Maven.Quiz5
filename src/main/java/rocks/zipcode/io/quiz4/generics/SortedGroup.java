package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    @Override
    public void insert(_ value) {
        if(list.size() == 0){
            list.add(value);
        } else if(list.get(list.size()-1).toString().compareTo(value.toString()) == 0 ){
            list.add(value);
        } else if(list.get(list.size()-1).toString().compareTo(value.toString()) == -1 ){
            list.add(value);
        } else {
            _ temp = list.get(list.size()-1);
            list.remove(temp);
            list.add(value);
            list.add(temp);
        }
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
    }

    public Integer indexOf(_ value) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == value){
                return i;
            }
        }
        return -1;
    }
}
