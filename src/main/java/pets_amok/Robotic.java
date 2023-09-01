package pets_amok;

public class Robotic extends VirtualPet {

    // Variables
    private int oilLevel;

    // Getters
    public int getOil() {
        return oilLevel;
    }

    // Setters
    public void setOil(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    // Constructor
    public Robotic(String name, String desc) {
        super(name, desc);
        this.oilLevel = 80;
    }

    // Methods
    public void addOil() {
        this.oilLevel = 100;
        this.setHealth(this.getHealth() + 50);
        this.setHappiness(this.getHappiness() + 50);
    }

    @Override
    public void tick() {
        super.tick();
        this.oilLevel -= 10;
        if (this.oilLevel <= 20) {
            this.setHealth(this.getHealth() - 10);
            if (this.getHealth() <= 0) {
                this.setHealth(0);
            }
        }
        if (this.oilLevel >= 100) {
            this.oilLevel = 100;
        } else if (this.oilLevel <= 0) {
            this.oilLevel = 0;
        }

    }
}
