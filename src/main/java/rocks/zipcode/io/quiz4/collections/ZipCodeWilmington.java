package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> studentsEnrolled;

    public ZipCodeWilmington(){
        this.studentsEnrolled = new ArrayList();
    }

    public void enroll(Student student) {
        studentsEnrolled.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return studentsEnrolled.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student student : studentsEnrolled){
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for(Student student : studentsEnrolled){
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
