package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    ArrayList<Student> students = new ArrayList<>();
    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        double timePerStudent = numberOfHours;
        for(Student student: students){
            student.learn(timePerStudent);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentMap = new HashMap<>();
        for(Student student: students){
            studentMap.put(student, student.getTotalStudyTime());
        }
        return studentMap;
    }
}
