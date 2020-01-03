package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.collections.SimpleStringGroup;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    private SimpleStringGroup group;
    public StringAssembler(Character delimeter) {
        this.group = new SimpleStringGroup();
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        this.group.insert(str);
        return this;
    }

    public String assemble() {
        String result = "";
        for (String word : this.group.getArr()) {
            result = make(result, word);
        }
        return result;
    }

    public String make (String original, String add) {
        return original + (original.length() > 0 ? this.delimeter : "") + add;
    }
}
