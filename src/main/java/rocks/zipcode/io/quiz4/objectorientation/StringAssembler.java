package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimiter;
    private String newDelimeter;
    private String string;

    public StringAssembler(Character delimeter) {

        this.delimiter = delimeter;
        this.newDelimeter = String.valueOf(delimeter);
        this.string = "";
    }

    public Character delimiter() {
        return delimiter;
    }

    public void setDelimeter(Character delimiter) {
        this.delimiter = delimiter;
    }

    public String getNewDelimeter() {
        return String.valueOf(delimiter);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public StringAssembler append(String str) {

        StringAssembler sa = new StringAssembler(delimiter);
        sa.setString(str);
        return sa;
    }

    public String assemble() {

        return null;
    }
}
