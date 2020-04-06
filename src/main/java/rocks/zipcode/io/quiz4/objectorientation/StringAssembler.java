package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimiter;
    private String string = "";

    public StringAssembler(Character delimiter) {

        this.delimiter = delimiter;
    }

    public StringAssembler append(String str) {

        string += str + delimiter;
        return this;
    }

    public String assemble() {

        return string.substring(0, string.length()-1);
    }
}
