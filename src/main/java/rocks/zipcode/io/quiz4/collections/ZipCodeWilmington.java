package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private List<Student> enrolled = new ArrayList<>();

    public void enroll(Student student) {
        enrolled.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return enrolled.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student s : enrolled){
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentMap = new LinkedHashMap<>();
        for(Student s : enrolled){
            studentMap.put(s, s.getTotalStudyTime());
        }
        return studentMap;
    }
}
