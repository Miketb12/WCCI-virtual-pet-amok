package pets_amok;

public class VirtualPet {

    // Variables
    private String name;

    private String desc;

    private int thirst;

    private int hunger;

    private int health;

    private int happiness;

    private String botOrOrgo;

    // Getters
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getBotOrOrgo() {
        return botOrOrgo;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setBotOrOrgo(String botOrOgo) {
        this.botOrOrgo = botOrOgo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // Constructors

    public VirtualPet(String name, String botOrOgo) {
        this.name = name;
        this.health = 80;
        this.happiness = 30;
        this.botOrOrgo = botOrOgo;
    }

    // Functions

    public void water() {
        thirst -= 15;
    }

    public void play() {
        happiness += 10;
    }

    public void feed() {
        hunger -= 10;
    }

    public void tick() {
        hunger += 5;
        thirst += 7;
        happiness -= 9;
        if (hunger <= 0) {
            hunger = 0;
        } else if (hunger >= 100) {
            hunger = 100;
        }
        if (happiness <= 0) {
            happiness = 0;
        } else if (happiness >= 100) {
            happiness = 100;
        }
        if (thirst <= 0) {
            thirst = 0;
        } else if (thirst >= 100) {
            thirst = 100;
        }
    }
}
