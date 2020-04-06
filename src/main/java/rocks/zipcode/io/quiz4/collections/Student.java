package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double studyHours;
    private Student student;


    public Student() {
        this(null);
        studyHours = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        this.student = student;
    }

    public void learn(Double amountOfHours) {
        studyHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return studyHours;
    }
}
