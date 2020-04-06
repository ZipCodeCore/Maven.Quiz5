package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Double totalAmountOfHoursLearned;
    Integer id;

    public Student() {
        this(null);
        this.totalAmountOfHoursLearned = 0D;
    }

    public Student(Integer id) {
        this.id = id;
        this.totalAmountOfHoursLearned = 0D;
    }

    public void learn(Double amountOfHours) {
        this.totalAmountOfHoursLearned += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalAmountOfHoursLearned;
    }
}
