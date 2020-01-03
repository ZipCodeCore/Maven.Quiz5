package rocks.zipcode.io.quiz4.collections;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {
    private String[] group;
    public SimpleStringGroup() {
        this.group = new String[0];
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public String[] getArr() { return this.group; }

    public Integer count() {
        return this.group.length;
    }

    public void insert(String string) {
        String[] group = new String[this.count()+1];

        for (int i = 0; i < this.group.length; i++)
            if (this.group.length > 0)
                group[i] = this.group[i];

        group[group.length-1] = string;
        this.group = group;
    }

    public Boolean has(String string) {
        for (String word : this.group) {
            if (string.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public String fetch(int indexOfValue) {
        if (indexOfValue < this.count())
            return this.group[indexOfValue];
        else
            throw new IndexOutOfBoundsException();
    }

    public void delete(String string) {
        String[] group = new String[this.group.length-1];
        boolean deleted = false;
        for (int i = 0; i < this.group.length; i++) {
            if (!this.group[i].equals(string)) {
                if (!deleted) group[i] = this.group[i];
                else group[i-1] = this.group[i];
            }
            else deleted = true;
        }
        this.group = group;
    }

    public void clear() {
        this.group = new String[0];
    }


    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
