package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private Map<Student,Double> enrolledStudents = new HashMap<>();

    public void enroll(Student student) {
        enrolledStudents.put(student,student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {
        return enrolledStudents.containsKey(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s : enrolledStudents.keySet()){
            s.learn(numberOfHours);
        }

    }

    public Map<Student, Double> getStudyMap() {
        return enrolledStudents;
    }
}
