package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimeter;
    String st;
    public StringAssembler(Character delimeter) {

        this.delimeter = delimeter;
        this.st = "";
    }

    public StringAssembler append(String str) {
        st += str + delimeter;
        return this;
    }

    public String assemble() {
        return st.substring(0, st.length()-1);
    }
}
