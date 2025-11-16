import java.util.List;

public class SuperMiniWay {
    private List<Node> SuperMiniWay;
    private Node firstNode;
    private Node lastNode;

    public enum Traffic {
        one, two, three, four, five,
    }

    private Traffic traffic;
    private boolean isDeadend;

    public SuperMiniWay(List<Node> SuperMiniWay, Node firstNode, Node lastNode, Traffic traffic, boolean isDeadend) {
        this.SuperMiniWay = SuperMiniWay;
        this.firstNode = firstNode;
        this.lastNode = lastNode;
        this.traffic = traffic;
        this.isDeadend = isDeadend;
    }

    public List<Node> getSuperMiniWay() {
        return SuperMiniWay;
    }

    public void setSuperMiniWay(List<Node> superMiniWay) {
        SuperMiniWay = superMiniWay;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public Traffic getTraffic() {
        return traffic;
    }

    public void setTraffic(Traffic traffic) {
        this.traffic = traffic;
    }

    public boolean isDeadend() {
        return isDeadend;
    }

    public void setDeadend(boolean deadend) {
        isDeadend = deadend;
    }
}
