package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private String s;
    private Character space;


    public StringAssembler(Character space) {
        s="";
        this.space= space;
    }

    public StringAssembler append(String str) {
        s += str+space;
        return this;
    }

    public String assemble() {
        return s.substring(0,s.length()-1);
    }
}
