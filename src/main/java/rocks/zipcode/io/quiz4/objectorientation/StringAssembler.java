package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    private StringBuilder newString;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.newString = new StringBuilder();
    }

    public StringAssembler append(String str) {
        newString.append(str);
        newString.append(this.delimeter);
        return null;
    }

    public String assemble() {
       return newString.toString();
    }

}
