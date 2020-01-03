package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimiter;
    String result = "";

    public StringAssembler(Character delimeter) {
        this.delimiter = delimeter;
    }

    public StringAssembler append(String str) {
        result = result.concat(str).concat(delimiter.toString());
        return this;
    }

    public String assemble() {
        return result.substring(0,result.length()-1);
    }
}
