package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    Integer StudentId;
    Double studyHours=0.0;

    public Student() {

        this(null);
    }

    public Student(Integer id) {
        this.StudentId=id;
    }

    public void learn(Double amountOfHours) {
        this.studyHours +=amountOfHours;
    }

    public Double getTotalStudyTime()
    {
        return studyHours;
    }
}
