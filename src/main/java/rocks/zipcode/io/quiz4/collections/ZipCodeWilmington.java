package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    ArrayList<Student> students = new ArrayList<>();

    public void enroll(Student student) {
        student.setEnrollmentStatus(true);
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return student.getEnrollmentStatus();
    }

    public void lecture(double numberOfHours) {
        students.forEach(student -> student.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new TreeMap<>();
        students.forEach(student -> result.put(student,student.getTotalStudyTime()));
        return result;
    }
}
