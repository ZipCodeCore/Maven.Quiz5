package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private  Character delimeter;
    private StringBuilder stringBuilder;
    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        stringBuilder = new StringBuilder();
    }

    public StringAssembler append(String str) {
        stringBuilder.append(str);
        stringBuilder.append(this.delimeter);
        return this;
    }
    public String assemble() {
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(""+ delimeter));
        return stringBuilder.toString();
    }
}
