package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    ArrayList<Student> students;

    public ZipCodeWilmington(){
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
        this.students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return this.students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student s : students){
            s.studyTime += numberOfHours/students.size();
        }
    }

    public Map<Student, Double> getStudyMap() {
        return null;
    }
}
