/**
 * Created by red6 on 4/13/2017.
 */
public class StringList {
    private String str = new String();

    public StringList() {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String addString(String strToAdd) {
        str = str + strToAdd;
        return getStr();
    }
}
