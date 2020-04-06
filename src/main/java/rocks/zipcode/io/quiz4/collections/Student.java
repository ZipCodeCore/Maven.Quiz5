package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Double totalAmountOfHoursLearned;
    private Integer id;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        this.totalAmountOfHoursLearned = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.totalAmountOfHoursLearned += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalAmountOfHoursLearned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
