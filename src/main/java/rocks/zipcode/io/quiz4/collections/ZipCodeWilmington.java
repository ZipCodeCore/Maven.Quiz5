package rocks.zipcode.io.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    Map<Student, Double> readMap = new LinkedHashMap<>();
    public void enroll(Student student) {
        readMap.put(student, student.getTotalStudyTime());

    }

    public Boolean isEnrolled(Student student) {

        return readMap.containsKey(student);
    }

    public void lecture(double numberOfHours) {
        for(Student student : readMap.keySet()){
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        for(Student student : readMap.keySet()){
            readMap.put(student,student.getTotalStudyTime());
        }
        return readMap;
    }
}
