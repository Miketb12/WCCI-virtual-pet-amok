package pets_amok;

public class RoboticDog extends Robotic {

    // Constructors
    public RoboticDog(String name, String desc) {
        super(name, desc);
    }

    // Methods

    public void walkDog() {
        this.setHappiness(this.getHappiness() + 50);
        this.tick();
    }

}
