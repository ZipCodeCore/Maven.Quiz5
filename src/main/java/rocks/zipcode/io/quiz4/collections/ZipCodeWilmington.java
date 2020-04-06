package rocks.zipcode.io.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private Map<Student, Double> map;

    public ZipCodeWilmington() {

        this.map = new LinkedHashMap<>();
    }

    public void enroll(Student student) {

        map.put(student, student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {

        return map.containsKey(student);
    }

    public void lecture(double numberOfHours) {

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            entry.getKey().learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        for (Map.Entry<Student, Double> entry : map.entrySet())
            entry.setValue(entry.getKey().getTotalStudyTime());
        return map;
    }
}
