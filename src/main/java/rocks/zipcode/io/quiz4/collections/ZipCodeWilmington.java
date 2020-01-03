package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> studentList;
    private double studyTime;

    public ZipCodeWilmington() {

        studentList = new ArrayList<Student>();
    }

    public void enroll(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
        }

    }

    public Boolean isEnrolled(Student student) {
        return studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student student : studentList) {
            student.learn(numberOfHours);
        }

    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<>();

        for (Student student : studentList) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
