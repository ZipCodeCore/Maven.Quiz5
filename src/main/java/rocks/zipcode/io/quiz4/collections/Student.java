package rocks.zipcode.io.quiz4.collections;

import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    double hours;
    public Student() {


    }

    public Student(Integer id) {
       this.id=id;
       hours=0.0;
    }

    public void learn(Double amountOfHours) {
        hours+=amountOfHours;
    }

    public Double getTotalStudyTime() {

        return hours;
    }
}
