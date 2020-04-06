package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimeter;
    String str;
    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.str = "";
    }

    public StringAssembler append(String str) {
        this.str += str;
        this.str += delimeter;

        return this;
    }

    public String assemble() {
        return str.substring(0,str.length()-1);
    }
}
