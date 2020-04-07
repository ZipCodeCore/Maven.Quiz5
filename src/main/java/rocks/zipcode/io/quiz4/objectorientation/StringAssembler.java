package rocks.zipcode.io.quiz4.objectorientation;

import java.util.Arrays;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private String output;
    private Character delimiter;

    public StringAssembler(Character delimeter) {
        this.delimiter = delimeter;
        output = "";
    }

    public StringAssembler append(String str) {
        output += str + delimiter;
        return this;
    }

    public String assemble() {
        return this.output.substring(0, this.output.length()-1);
    }


}
