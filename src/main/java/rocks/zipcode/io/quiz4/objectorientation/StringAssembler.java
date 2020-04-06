package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private String output;
    private final Character delimit;

    public StringAssembler(Character delimeter) {
        this.output = "";
        this.delimit = delimeter;
    }

    public StringAssembler append(String str) {
       this.output += str + this.delimit;
       return this;
    }

    public String assemble() {
        return this.output.substring(0, this.output.length() - 1);
    }
}
