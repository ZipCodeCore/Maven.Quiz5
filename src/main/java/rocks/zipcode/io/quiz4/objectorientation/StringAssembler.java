package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character origDelimeter;
    private String newDelimeter;
    private String string;

    public Character getOrigDelimeter() {
        return origDelimeter;
    }

    public void setOrigDelimeter(Character origDelimeter) {
        this.origDelimeter = origDelimeter;
    }

    public String getNewDelimeter() {
        return String.valueOf(origDelimeter);
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public StringAssembler(Character delimeter) {
        this.origDelimeter = delimeter;
        this.newDelimeter = String.valueOf(delimeter);
        this.string = "";
    }

    public StringAssembler append(String str) {
        StringAssembler sa = new StringAssembler(origDelimeter);
        sa.setString(str);
        return sa;
    }

    public String assemble() {
//StringBuilder sb = new StringBuilder();
//sb.append()
//        sb.append()
        return null;
    }
}
