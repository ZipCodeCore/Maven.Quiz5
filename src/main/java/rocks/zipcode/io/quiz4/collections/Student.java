package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    Double studyTime = 0.0;
    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        studyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return studyTime;
    }
}
