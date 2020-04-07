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
        if(assembled != null)
        {
            assembled = assembled + str + delimiter;
        }
        else
        {
            assembled = str + delimiter;
        }
        return this;
    }

    public String assemble()
    {
        return assembled.substring(0, assembled.length() - 1);
    }
}
