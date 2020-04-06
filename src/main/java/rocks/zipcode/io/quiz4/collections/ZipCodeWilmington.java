package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    Student student;
    List<Student> studentList;

    public ZipCodeWilmington() {
        this.student = new Student();
        studentList= new ArrayList<>();
    }

    public void enroll(Student student) {
       studentList.add(student);

    }

    public Boolean isEnrolled(Student student) {

        return studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s : studentList){
            s.learn(numberOfHours);
        }

    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (Student s:studentList){
            map.put(s,s.getTotalStudyTime());

        }
        return map;
    }
}
