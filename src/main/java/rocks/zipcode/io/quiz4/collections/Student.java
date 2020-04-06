package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private static Integer id;
    private double amountOfHours;

    public Student() {
        this(id);
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.amountOfHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return amountOfHours;
    }

}
