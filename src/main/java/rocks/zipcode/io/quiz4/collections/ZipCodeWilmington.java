package rocks.zipcode.io.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private LinkedList<Student> students;

    public ZipCodeWilmington(){
        students = new LinkedList<>();
    }
    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student s : students){
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> retMap = new LinkedHashMap<>();
        for(Student s: students){
            retMap.put(s, s.getTotalStudyTime());
        }
        return retMap;
    }
}
