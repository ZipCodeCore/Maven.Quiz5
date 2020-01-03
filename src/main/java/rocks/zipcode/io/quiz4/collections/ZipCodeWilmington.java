package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private ArrayList<Student>students=new ArrayList<>();

    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s:students) {
            s.learn(numberOfHours/students.size());
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap= new HashMap<>();
        for (Student s:students){
            studyMap.put(s,s.getTotalStudyTime());
        }
        return studyMap;
    }
}
