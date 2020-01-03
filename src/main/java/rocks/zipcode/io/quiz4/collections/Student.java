package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double totalStudyTime = 0.0;

    public Student() {

    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

    public Integer getId() {
        return id;
    }
}
