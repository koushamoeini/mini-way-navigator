import java.util.List;

public class Range {
    private String name;
    private List<Node> nRange;
    private List<SuperMiniWay> wRange;

    public Range(String name, List<Node> nRange, List<SuperMiniWay> wRange) {
        this.name = name;
        this.nRange = nRange;
        this.wRange = wRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getnRange() {
        return nRange;
    }

    public void setnRange(List<Node> nRange) {
        this.nRange = nRange;
    }

    public List<SuperMiniWay> getwRange() {
        return wRange;
    }

    public void setwRange(List<SuperMiniWay> wRange) {
        this.wRange = wRange;
    }
}
