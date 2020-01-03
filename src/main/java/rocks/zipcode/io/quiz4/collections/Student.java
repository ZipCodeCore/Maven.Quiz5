package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double totalStudyTime;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.totalStudyTime = 0.0;
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

    public Integer getId() { return this.id; }
    public void setId(Integer id) {
        this.id = id;
    }
}
