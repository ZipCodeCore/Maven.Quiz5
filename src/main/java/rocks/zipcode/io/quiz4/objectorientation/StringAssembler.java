package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimeter;
    String string = "";

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {

        if(string.length() == 0){
            string= str;

        } else {
            string += delimeter + str;
        }

        return this;
    }


    public String assemble() {
        return this.string;
    }
}
