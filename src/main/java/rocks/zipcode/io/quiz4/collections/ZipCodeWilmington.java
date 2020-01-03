package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    ArrayList<Student> allStudents = new ArrayList<>();


    public void enroll(Student student) {
        allStudents.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return allStudents.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student each : allStudents){
            each.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new LinkedHashMap<>();

        for (Student each : allStudents){
            result.put(each,each.getTotalStudyTime());
        }
        return result;
    }
}
