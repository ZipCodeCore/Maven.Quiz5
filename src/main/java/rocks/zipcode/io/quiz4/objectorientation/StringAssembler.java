package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    Character delimeter;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        String[] words = str.split ( " " );
        StringBuilder builder = new StringBuilder (  );
        for (String b : words) {
            builder.append ( words );
            builder.append ( delimeter );
        }
        return null;
    }

    public String assemble() {
        return assemble ();
    }
}
