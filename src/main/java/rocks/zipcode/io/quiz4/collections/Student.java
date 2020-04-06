package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Double totalStudyTime;
    private Integer id;

    public Student(Integer id) {
        this.totalStudyTime = 0.0;
        this.id = id;
    }

    public Student() {
        this.totalStudyTime = 0.0;
        this.id = 0;

    }

    public void learn(Double amountOfHours) {
        this.totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {

        return totalStudyTime;
    }
}
