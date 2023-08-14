package pets_amok;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {

    private int litterbox;

    public void setLitterBox(int litterSoilLvl) {
        this.litterbox = litterSoilLvl;
    }

    public int getLitterSoil() {
        return litterbox;
    }

    // Collections
    List<VirtualPet> shelter = new ArrayList<VirtualPet>();
    List<OrganicDog> dogShelterO = new ArrayList<OrganicDog>();
    List<RoboticDog> dogShelterR = new ArrayList<RoboticDog>();
    List<OrganicCat> catShelterO = new ArrayList<OrganicCat>();
    List<RoboticCat> catShelterR = new ArrayList<RoboticCat>();

    // Methods
    public void addPet(VirtualPet pet) {
        shelter.add(pet);
    }

    public void addOrgoDog(OrganicDog pet) {
        dogShelterO.add(pet);
    }

    public void addOrgoCat(OrganicCat pet) {
        catShelterO.add(pet);
    }

    public void addRoboDog(RoboticDog pet) {
        dogShelterR.add(pet);
    }

    public void addRoboCat(RoboticCat pet) {
        catShelterR.add(pet);
    }

    public void showAllPets() {
        System.out.println("Name\t\tHealth\t\tHappiness\tCage/Oil/Litterbox Soil\t\tOrganic or Robotic");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        for (int i = 0; i < dogShelterO.size(); i++) {
            System.out.println(
                    dogShelterO.get(i).getName() + "\t\t|" + dogShelterO.get(i).getHealth() + "\t\t"
                            + dogShelterO.get(i).getHappiness() + "\t\t\t" + dogShelterO.get(i).getSoilLvl()
                            + "\t\t\t\t"
                            + dogShelterO.get(i).getBotOrOrgo());
        }
        for (int j = 0; j < dogShelterR.size(); j++) {
            System.out.println(
                    dogShelterR.get(j).getName() + "\t\t|" + dogShelterR.get(j).getHealth() + "\t\t"
                            + dogShelterR.get(j).getHappiness() + "\t\t\t" + dogShelterR.get(j).getOil() + "\t\t\t\t"
                            + dogShelterR.get(j).getBotOrOrgo());
        }
        for (int m = 0; m < catShelterO.size(); m++) {
            System.out.println(
                    catShelterO.get(m).getName() + "\t\t|" + catShelterO.get(m).getHealth() + "\t\t"
                            + catShelterO.get(m).getHappiness() + "\t\t\t" + litterbox + "\t\t\t\t"
                            + catShelterO.get(m).getBotOrOrgo());
        }
        for (int n = 0; n < catShelterR.size(); n++) {
            System.out.println(
                    catShelterR.get(n).getName() + "\t\t|" + catShelterR.get(n).getHealth() + "\t\t"
                            + catShelterR.get(n).getHappiness() + "\t\t\t" + catShelterR.get(n).getOil() + "\t\t\t\t"
                            + catShelterR.get(n).getBotOrOrgo());
        }

    }

    public void feedPets() {
        for (int i = 0; i < shelter.size(); i++) {
            shelter.get(i).feed();
        }
    }

    public void waterPets() {
        for (int i = 0; i < shelter.size(); i++) {
            shelter.get(i).water();
        }
    }

    public void playWithPet(String name) {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i).getName().indexOf(name) == 0) {
                shelter.get(i).play();
            }
        }
    }

    public void adoptPet(String name) {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i).getName().indexOf(name) == 0) {
                shelter.remove(i);
            }
        }
    }

    public void showNameAndDesc() {
        System.out.println("Name\tDescription");
        System.out.println("-------------------");
        for (int i = 0; i < shelter.size(); i++) {
            System.out.println(
                    shelter.get(i).getName() + "\t|" + shelter.get(i).getDesc());
        }
    }

    public void tick() {

        litterbox += 15;
        for (int i = 0; i < shelter.size(); i++) {
            shelter.get(i).tick();

        }
        for (int i = 0; i < dogShelterO.size(); i++) {
            dogShelterO.get(i).soilInc();
        }
        for (int j = 0; j < dogShelterR.size(); j++) {
            dogShelterR.get(j).addRust();
        }
        for (int i = 0; i < catShelterR.size(); i++) {
            catShelterR.get(i).addRust();
        }
    }

    // AMOK ADDITIONS

    public void oilBots() {
        for (int i = 0; i < catShelterR.size(); i++) {
            catShelterR.get(i).setOil(100);
        }
        for (int j = 0; j < dogShelterR.size(); j++) {
            dogShelterR.get(j).setOil(100);
        }
    }

    public void cleanCages() {
        for (int i = 0; i < dogShelterO.size(); i++) {
            dogShelterO.get(i).setSoilLvl(-10);
        }
    }

    public void emptyLitter() {
        litterbox = -15;
    }

    public void walkDogs() {

    }
}
