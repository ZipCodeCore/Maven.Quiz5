package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    Character delimeter;
    String result = "";

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        result += str + delimeter;
        return this;
    }

    public String assemble() {
        return this.result.substring(0, result.length() - 1);
    }
}
