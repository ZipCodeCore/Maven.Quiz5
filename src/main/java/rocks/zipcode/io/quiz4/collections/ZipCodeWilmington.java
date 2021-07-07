package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    List<Student> students = new ArrayList<>();

    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        if (students.contains(student)) {
            return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        for (Student student : students) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<>();
        for (Student student : students) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
