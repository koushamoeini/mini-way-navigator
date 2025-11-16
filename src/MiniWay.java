
public class MiniWay {
    private boolean isOneWay;
    private SuperMiniWay superMiniWay1;
    private SuperMiniWay superMiniWay2;

    public MiniWay(Boolean isOneWay, SuperMiniWay superMiniWay1, SuperMiniWay superMiniWay2) {
        this.isOneWay = isOneWay;
        this.superMiniWay1 = superMiniWay1;
        if(!isOneWay)
            this.superMiniWay2 = superMiniWay2;
    }

    public boolean isOneWay() {
        return isOneWay;
    }

    public void setOneWay(boolean oneWay) {
        isOneWay = oneWay;
    }

    public SuperMiniWay getSuperMiniWay1() {
        return superMiniWay1;
    }

    public void setSuperMiniWay1(SuperMiniWay superMiniWay1) {
        this.superMiniWay1 = superMiniWay1;
    }

    public SuperMiniWay getSuperMiniWay2() {
        return superMiniWay2;
    }

    public void setSuperMiniWay2(SuperMiniWay superMiniWay2) {
        this.superMiniWay2 = superMiniWay2;
    }
}
