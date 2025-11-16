import java.util.ArrayList;
import java.util.List;

public class Relation {
    private List<Tag> tag;
    private List<Way> wRelation;

    public Relation(List<Tag>tag,Way way) {
        this.tag = tag;
        this.wRelation = WRelation(way);
    }

    public List<Way> WRelation(Way way) {
        List<Way> NRealation = new ArrayList<>();
        sib:for (Way value : wRelation) {
            if(way.equals(value.getWay()))
                continue;
            for(int i=0;i<way.getWay().size();i++){
                for(int j=0;j<value.getWay().size();j++){
                    for(int k=0;k<way.getWay().get(i).getSuperMiniWay1().getSuperMiniWay().size();k++){
                        for(int l=0;l<value.getWay().get(j).getSuperMiniWay1().getSuperMiniWay().size();l++){
                            if(way.getWay().get(i).getSuperMiniWay1().getSuperMiniWay().get(k).equals
                                    (value.getWay().get(j).getSuperMiniWay1().getSuperMiniWay().get(l))) {
                                NRealation.add(value);
                                continue sib;
                            }
                        }
                    }
                }
            }
        }
        return NRealation;
    }
    public List<Way> getwRelation() {
        return wRelation;
    }
    public void setwRelation(List<Way> wRelation) {
        this.wRelation = wRelation;
    }
    public List<Tag> getTag() {
        return tag;
    }
    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }
}
