package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    List<String> listOfStrings = new ArrayList<>();
    Character delimeter;
    String result;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        listOfStrings.add(str);
        return null;
    }

    public String assemble() {
        for (int i = 0; i < listOfStrings.size(); i++) {
            result += listOfStrings.get(i);
            if (i != listOfStrings.size()) {
                result += delimeter;
            }
        }
        return result;
    }
}
