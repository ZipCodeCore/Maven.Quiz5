package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    Double totalStudyTime;
    public Student() {
        this(null);
    }

    public Student(Integer id) {
        if(this.id != null){
            this.id = id;
        }
        else{
            this.id = 0;
        }
        this.totalStudyTime = 0.0;
    }

    public void learn(Double amountOfHours) {
        totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
