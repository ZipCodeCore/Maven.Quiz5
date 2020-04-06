package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private final List<Student> enrolled;

    public ZipCodeWilmington() {
        this.enrolled = new ArrayList<>();
    }

    public void enroll(Student student) {
        this.enrolled.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return enrolled.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s : enrolled) {
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> output = new HashMap<>();
        for (Student s : enrolled) {
            output.compute(s, (k, v) -> (v==null) ? s.getTotalStudyTime() : s.getTotalStudyTime() + v);
        }
        return output;
    }
}
