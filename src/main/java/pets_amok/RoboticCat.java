package pets_amok;

public class RoboticCat extends VirtualPet {

    private int oilLevel;

    public int getOil() {
        return oilLevel;
    }

    public void setOil(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public RoboticCat(String name, String botOrOgo) {
        super(name, botOrOgo);
        this.oilLevel = 80;
    }

    public void addRust() {
        oilLevel -= 10;
    }
}
