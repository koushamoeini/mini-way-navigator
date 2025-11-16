import java.util.HashMap;

public class Tag {
    private HashMap<String,String> tag;

    public Tag(HashMap<String, String> tag) {
        this.tag = tag;
    }

    public HashMap<String, String> getTag() {
        return tag;
    }

    public void setTag(HashMap<String, String> tag) {
        this.tag = tag;
    }
}

