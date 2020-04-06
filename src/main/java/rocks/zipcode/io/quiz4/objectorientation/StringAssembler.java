package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler
{
    private Character delimiter;
    String assembled;

    public StringAssembler(Character delimiter)
    {
        this.delimiter = delimiter;
    }

    // TODO: Come back to this
    public StringAssembler append(String str)
    {
        assembled = str + delimiter;
        return this;
    }

    public String assemble()
    {
        return assembled;
    }
}
