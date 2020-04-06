package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> list;

    public ZipCodeWilmington(){
        list = new ArrayList<>();
    }

    public void enroll(Student student) {
        list.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return list.contains(student);
    }

    public void lecture(double numberOfHours) {
        list.forEach(s -> s.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<>();
        list.forEach(s -> map.put(s,s.sum));
        return map;
    }
}
