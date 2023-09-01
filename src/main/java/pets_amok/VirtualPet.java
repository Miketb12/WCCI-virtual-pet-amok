package pets_amok;

public class VirtualPet {

    // Variables
    private String name;

    private String desc;

    private int happiness;

    private int health;

    // Getters
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Constructors

    public VirtualPet(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.health = 80;
        this.happiness = 100;
    }

    public VirtualPet(String name) {
        this.name = name;
    }

    // Functions

    public void play() {
        this.happiness += 40;
    }

    public void tick() {
        this.happiness -= 10;
        this.health -= 5;
        if (this.happiness <= 40) {
            this.health -= 10;
        }
        if (this.health <= 0) {
            this.health = 10;
        }
        if (this.health >= 100) {
            this.health = 100;
        } else if (this.health <= 0) {
            this.health = 0;
        }
        if (this.happiness >= 100) {
            this.happiness = 100;
        } else if (this.happiness <= 0) {
            this.happiness = 0;
        }
    }
}
