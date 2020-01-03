package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Integer id;
    private Double studyTime;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        this.studyTime = 0.0;
    }

    public void learn(Double amountOfHours) {
        if(amountOfHours > 0) this.studyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.studyTime;
    }
}
