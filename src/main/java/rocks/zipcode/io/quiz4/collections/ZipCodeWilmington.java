package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> students;

    public ZipCodeWilmington(){
        students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {

        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        students.forEach(s->s.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {

        return students.stream()
                .collect(Collectors.toMap(student -> student, Student::getTotalStudyTime));
    }
}
