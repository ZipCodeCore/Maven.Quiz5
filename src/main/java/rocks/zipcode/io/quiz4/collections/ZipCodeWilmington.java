package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> students;
    private Integer nextId;

    public ZipCodeWilmington () {
        this.students = new ArrayList<>();
        this.nextId = 0;
    }

    public void enroll(Student student) {
        student.setId(++nextId);
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
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
