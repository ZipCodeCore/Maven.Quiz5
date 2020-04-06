package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable{

    private Integer id;
    private Double studyTime;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        this.studyTime = 0.0;
    }

    public void learn(Double amountOfHours) {
        studyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return studyTime;
    }

    @Override
    public int compareTo(Object o) {
        if(this.id != null && ((Student)o).id != null){
            return this.id - ((Student)o).id;
        }else{
            return (int)(((Student)o).studyTime - this.studyTime);
        }
    }
}
