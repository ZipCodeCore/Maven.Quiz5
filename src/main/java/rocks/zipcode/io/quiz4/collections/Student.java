package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
Integer id;
Double amountOfHours;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.amountOfHours = amountOfHours;
    }

    public Double getTotalStudyTime() {
        return amountOfHours;
    }
}
