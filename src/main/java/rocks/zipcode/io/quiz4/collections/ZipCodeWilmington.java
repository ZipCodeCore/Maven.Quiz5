package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington
{
    List<Student> students;

    public ZipCodeWilmington(List<Student> students)
    {
        this.students = students;
    }

    public ZipCodeWilmington()
    {
        this(new ArrayList<Student>());
    }

    public void enroll(Student student)
    {
        students.add(student);
    }

    public Boolean isEnrolled(Student student)
    {
        return students.contains(student);
    }

    public void lecture(double numberOfHours)
    {
        for(Student s : students)
        {
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap()
    {
        Map<Student, Double> studyMap;
        studyMap = new LinkedHashMap<>();

        for(Student s : students)
        {
            studyMap.putIfAbsent(s, s.getTotalStudyTime());
        }

        return studyMap;
    }
}
