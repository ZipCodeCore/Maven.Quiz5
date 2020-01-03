package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    Double totalAmountOfHours = 0.0;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
    }

    public void learn(Double amountOfHours) {
        totalAmountOfHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalAmountOfHours;
    }
}
