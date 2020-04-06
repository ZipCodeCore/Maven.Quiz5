package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> cohort;

    public ZipCodeWilmington() {
        this.cohort = new ArrayList<>();
    }

    public ZipCodeWilmington(List<Student> cohort) {
        this.cohort = cohort;
    }

    public void enroll(Student student) {
        cohort.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return cohort.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student student : cohort) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for (Student student : cohort) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
