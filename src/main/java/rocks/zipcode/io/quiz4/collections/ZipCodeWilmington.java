package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private ArrayList<Student> roster = new ArrayList<> (  );

    public void enroll(Student student) {
        roster.add ( student );
    }

    public Boolean isEnrolled(Student student) {

        return roster.contains ( student );
    }

    public void lecture(double numberOfHours) {
        for (Student student : roster) {
            student.learn ( numberOfHours / roster.size () );
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<> (  );
        for (Student student : roster)
        studyMap.put ( student, student.getTotalStudyTime ());

        return studyMap;
    }
}
