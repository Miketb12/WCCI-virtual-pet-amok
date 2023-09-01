package pets_amok;

public class OrganicCat extends Organic {

    public OrganicCat(String name, String desc, int hunger, int thirst) {
        super(name, desc, hunger, thirst);
    }

    @Override
    public void tick() {
        super.tick();
        VirtualPetShelter.setLitterBox(VirtualPetShelter.getLitterBox() + 5);
        if (VirtualPetShelter.getLitterBox() >= 80) {
            this.setHealth(this.getHealth() - 10);
            if (this.getHealth() <= 0) {
                this.setHealth(0);
            }
        }
        if (VirtualPetShelter.getLitterBox() >= 100) {
            VirtualPetShelter.setLitterBox(100);
        } else if (VirtualPetShelter.getLitterBox() <= 0) {
            VirtualPetShelter.setLitterBox(0);
        }
    }

}
