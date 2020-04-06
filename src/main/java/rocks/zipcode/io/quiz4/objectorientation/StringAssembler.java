package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    String builtSoFar;

    public StringAssembler(Character delimeter)
    {
        this.delimeter = delimeter;
    }

    // TODO: Come back to this
    public StringAssembler append(String str)
    {
        return null;
    }

    public String assemble() {
        return builtSoFar;
    }
}
