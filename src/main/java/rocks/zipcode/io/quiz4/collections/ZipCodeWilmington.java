package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    List<Student> listOfStudents = new ArrayList<>();

    public void enroll(Student student) {
        listOfStudents.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return listOfStudents.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s : listOfStudents) {
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for (Student s : listOfStudents) {
            studyMap.put(s, s.hours);
        }
        return studyMap;
    }
}
