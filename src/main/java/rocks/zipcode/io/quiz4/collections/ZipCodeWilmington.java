package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> studentList;

    public ZipCodeWilmington(){
        this.studentList = new ArrayList<>();
    }
    public void enroll(Student student) {
        this.studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {

        return this.studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student a: studentList){
            a.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for(Student a : studentList){
            studyMap.put(a, a.getTotalStudyTime());
        }
        return studyMap;
    }
}
