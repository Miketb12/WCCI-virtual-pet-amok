package pets_amok;

public class Organic extends VirtualPet {

    // Variables

    private int thirst;

    private int hunger;

    // Getters

    public int getThirst() {
        return thirst;
    }

    public int getHunger() {
        return hunger;
    }

    // Setters

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    // Constructor

    public Organic(String name, String desc, int hunger, int thirst) {
        super(name, desc);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    // Methods

    public void feed() {
        this.hunger -= 15;
        this.setHealth(this.getHealth() + 40);
        this.setHappiness(this.getHappiness() + 25);
    }

    public void water() {
        this.thirst -= 15;
        this.setHealth(this.getHealth() + 40);
        this.setHappiness(this.getHappiness() + 25);
    }

    @Override
    public void tick() {
        super.tick();
        this.hunger += 5;
        this.thirst += 5;
        if (this.hunger >= 80 && this.thirst >= 80) {
            this.setHealth(this.getHealth() - 20);
        }
        if (this.thirst >= 100) {
            this.thirst = 100;
        } else if (this.thirst <= 0) {
            this.thirst = 0;
        }
        if (this.hunger >= 100) {
            this.hunger = 100;
        } else if (this.hunger <= 0) {
            this.hunger = 0;
        }
    }

}
