package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double amountOfHours;
    double totalStudyTime;
    public Student() {
        this(0);
    }

    public Student(Integer id) {
        this.id = id;

    }

    public void learn(Double amountOfHours) {
        totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}