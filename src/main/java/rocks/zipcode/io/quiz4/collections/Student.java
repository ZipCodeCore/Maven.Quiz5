package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Double studyHours;
    private int id;
    public Student() {
        this.id=0;
        this.studyHours=0.00;
    }

    public Student(Integer id) {
       this.id = id;
       this.studyHours=0.00;
    }

    public void learn(Double amountOfHours) {
        this.studyHours+=amountOfHours;
    }

    public Double getTotalStudyTime() {
        return studyHours;
    }
}
