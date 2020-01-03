package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimeter;
    String str;
    StringAssembler stringAssembler;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;

    }

    public StringAssembler append(String str) {
        this.str = str;
        return null;
    }

    public String assemble() {
        return null;
    }
}
