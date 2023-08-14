package pets_amok;

public class OrganicDog extends VirtualPet {

    private int cageSoilLvl;

    public void setSoilLvl(int soilLvl) {
        this.cageSoilLvl = soilLvl;
    }

    public int getSoilLvl() {
        return cageSoilLvl;
    }

    public OrganicDog(String name, String botOrOgo) {
        super(name, botOrOgo);
        this.cageSoilLvl = 20;
    }

    public void soilInc() {
        cageSoilLvl += 10;
    }

}
