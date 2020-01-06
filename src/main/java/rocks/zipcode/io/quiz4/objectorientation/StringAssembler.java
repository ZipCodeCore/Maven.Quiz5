package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimeter;
    String str2;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.str2 = "";
    }

    public StringAssembler append(String str) {
        this.str2 += str + delimeter;
        return this;
    }

    public String assemble() {
        return this.str2.substring(0, str2.length()-1);
    }
}
