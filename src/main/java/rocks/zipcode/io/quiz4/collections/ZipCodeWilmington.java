package rocks.zipcode.io.quiz4.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> studentList = new ArrayList<>();

    public void enroll(Student student) {
        studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s : studentList){
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for (Student s : studentList) {
            studyMap.put(s, s.hours);
        }
        return studyMap;
    }
}
