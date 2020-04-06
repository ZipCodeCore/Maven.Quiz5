package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    Character deli;
    StringBuilder sb;

    public StringAssembler(Character delimeter) {
        sb = new StringBuilder();
        deli = delimeter;
    }

    public StringAssembler append(String str) {
        sb.append(str).append(deli);
        return this;
    }

    public String assemble() {
        return sb.substring(0, sb.length()-1);
    }
}
