package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> enrolled;

    public ZipCodeWilmington() {
        this.enrolled = new ArrayList<Student>();
    }

    public void enroll(Student student) {
        this.enrolled.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return enrolled.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student student : enrolled){
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student,Double> studyMap = new LinkedHashMap<>();
        for(Student student: enrolled){
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
