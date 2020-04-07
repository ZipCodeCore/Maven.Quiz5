package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double amountOfHours;
    private Double totalStudyTime;
    public Student() {
        this(0);
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