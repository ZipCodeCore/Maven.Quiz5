package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character ch;
    String result;

    public StringAssembler(Character delimeter) {
        this.ch = delimeter;
        result = "";
    }

    public StringAssembler append(String str) {
        if(result.equals("")){
            result += str;
        } else {
            result += ch;
            result += str;
        }
        return this;
    }

    public String assemble() {
        return result;
    }
}
