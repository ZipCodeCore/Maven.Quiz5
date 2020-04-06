package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    Integer id;
    Double sum;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        sum = 0.0;
    }

    public void learn(Double amountOfHours) {
        sum += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
