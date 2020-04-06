package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimiter;
    String wholeString;

    public StringAssembler(Character delimeter) {
        this.delimiter = delimeter;
        this.wholeString = "";
    }

    public StringAssembler append(String str) {
        this.wholeString += str + delimiter;
        return this;
    }

    public String assemble() {
        String assembled = "";
        for (int i = 0; i < wholeString.length()-1; i++){
            assembled += wholeString.charAt(i);
        }
        return assembled;
    }
}
