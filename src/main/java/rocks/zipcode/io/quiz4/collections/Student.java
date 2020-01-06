package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    Double numOfHours;

    public Student() {
        this(null);
        this.numOfHours = 0.0;
    }

    public Student(Integer id) {
        this.numOfHours = 0.0;
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.numOfHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.numOfHours;
    }
}
