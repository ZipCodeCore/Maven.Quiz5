package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    List<Student> stud = new ArrayList<>();
    public void enroll(Student student) {
        stud.add(student);

    }

    public Boolean isEnrolled(Student student) {
        return stud.contains(student);
    }

    public void lecture(double numberOfHours) {


    }


    public Map<Student, Double> getStudyMap() {

        return null;}
}
