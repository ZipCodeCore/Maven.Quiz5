package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable<Student>{
    private Integer id;
    private Double hours;
    private Boolean enrollmentStatus;


    public Student() {
        this.id = 0;
        this.hours = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        this.hours = 0.0;
    }

    public void learn(Double amountOfHours) {
        hours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return hours;
    }

    public Boolean getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(Boolean enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student s) {
        return this.id.compareTo(s.getId());
    }
}
