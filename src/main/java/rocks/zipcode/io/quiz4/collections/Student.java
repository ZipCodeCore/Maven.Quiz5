package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double studyHours;
    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        studyHours = 0.0;
    }

    public void learn(Double amountOfHours) {
        studyHours += amountOfHours;
    }

    public Double getTotalStudyTime() {

        return studyHours;
    }
}
