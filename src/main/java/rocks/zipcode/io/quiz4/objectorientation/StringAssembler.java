package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private StringBuilder stringBuilder = new StringBuilder();
    private Character delimeter;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        if(assemble().equals("")) {
            stringBuilder.append(str);
        }
        else {
            stringBuilder.append(delimeter);
            stringBuilder.append(str);
        }
        return this;
    }

    public String assemble() {
        return stringBuilder.toString();
    }
}
