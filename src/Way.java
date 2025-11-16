import java.util.List;

public class Way {

    private String name;
    private int id=0;
    private List<MiniWay> way;
    private Tag tag;

    public Way(String name,List<MiniWay> way,Tag tag) {
        this.way = way;
        this.name=name;
        this.tag=tag;
        this.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MiniWay> getWay() {
        return way;
    }

    public void setWay(List<MiniWay> way) {
        this.way = way;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

}
