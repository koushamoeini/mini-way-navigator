public class Node {
    private int latitude;
    private int longitude;
    private int id=0;
    private Tag tag;

    public Node(int latitude, int longitude,Tag tag) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.id++;
        this.tag=tag;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
