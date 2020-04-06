package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    Double studyTime;

    public Student() {

        this(null);
        this.studyTime = 0.00;
    }

    public Student(Integer id) {
        this.id = id;
        this.studyTime = 0.00;
    }

    public void learn(Double amountOfHours) {

        this.studyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {

        return studyTime;
    }
}
