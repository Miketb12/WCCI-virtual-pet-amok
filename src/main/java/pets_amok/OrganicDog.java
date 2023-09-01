package pets_amok;

import java.util.Random;

public class OrganicDog extends Organic {

    // Variables
    private int cageSoilLvl;

    private int soilChance;

    public int getSoilChance() {
        return soilChance;
    }

    public void setSoilChance(int soilChance) {
        this.soilChance = soilChance;
    }

    // Setters
    public void setSoilLvl(int soilLvl) {
        this.cageSoilLvl = soilLvl;
    }

    // Getters
    public int getSoilLvl() {
        return cageSoilLvl;
    }

    // Constructor
    public OrganicDog(String name, String desc, int hunger, int thirst) {
        super(name, desc, hunger, thirst);
        this.cageSoilLvl = 0;
    }

    // Methods
    public void cleanCage() {
        cageSoilLvl = 0;
    }

    public void walkDog() {
        this.setHappiness(this.getHappiness() + 50);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.cageSoilLvl >= 75) {
            this.setHealth(this.getHealth() - 20);
            if (this.getHealth() <= 0) {
                this.setHealth(0);
            }
        }
        if (this.cageSoilLvl >= 100) {
            this.cageSoilLvl = 100;
        } else if (this.cageSoilLvl <= 0) {
            this.cageSoilLvl = 0;
        }
        this.soilChance += 5;
        // create instance of Random class
        Random rand = new Random();
        // Generate random integers in range 0 to 99
        int rand_int1 = rand.nextInt(100);
        if (rand_int1 < soilChance) {
            this.cageSoilLvl += 10;
        }
    }

}
