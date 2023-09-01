package pets_amok;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {

    // Variables

    private static int litterbox;

    public static int petNum = 1;

    // Setters

    public static void setLitterBox(int litterSoilLvl) {
        litterbox = litterSoilLvl;
    }

    // Getters

    public static int getLitterBox() {
        return litterbox;
    }

    // Collections
    List<VirtualPet> shelter = new ArrayList<VirtualPet>();

    // Methods
    public void addPet(VirtualPet pet) {
        shelter.add(pet);
    }

    public void showAllPets() {
        System.out.println("Name\t\tHappiness\tHealth\t\tHunger\t\tThirst\t\tCage Soil\tOil Level\tLitterBox Soil");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i) instanceof OrganicDog) {
                OrganicDog myDog = (OrganicDog) shelter.get(i);
                System.out.println(myDog.getName() + "\t\t" + myDog.getHappiness() + "\t\t" + myDog.getHealth() + "\t\t"
                        + myDog.getHunger() + "\t\t"
                        + myDog.getThirst() + "\t\t" + myDog.getSoilLvl() + "\t\t" + "--" + "\t\t" + "--");
            } else if (shelter.get(i) instanceof RoboticDog) {
                RoboticDog roboDog = (RoboticDog) shelter.get(i);
                System.out
                        .println(roboDog.getName() + "\t\t" + roboDog.getHappiness() + "\t\t" + roboDog.getHealth()
                                + "\t\t" + "--" + "\t\t" + "--"
                                + "\t\t"
                                + "--" + "\t\t" + roboDog.getOil() + "\t\t" + "--");
            } else if (shelter.get(i) instanceof OrganicCat) {
                OrganicCat myCat = (OrganicCat) shelter.get(i);
                System.out.println(
                        myCat.getName() + "\t\t" + myCat.getHappiness() + "\t\t" + myCat.getHealth() + "\t\t"
                                + myCat.getHunger() + "\t\t"
                                + myCat.getThirst() + "\t\t" + "--" + "\t\t" + "--" + "\t\t"
                                + VirtualPetShelter.getLitterBox());
            } else if (shelter.get(i) instanceof RoboticCat) {
                RoboticCat roboCat = (RoboticCat) shelter.get(i);
                System.out
                        .println(roboCat.getName() + "\t\t" + roboCat.getHappiness() + "\t\t" + roboCat.getHealth()
                                + "\t\t" + "--" + "\t\t" + "--"
                                + "\t\t"
                                + "--" + "\t\t" + roboCat.getOil() + "\t\t" + "--");
            }
        }

    }

    public void feedPets() {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i) instanceof Organic) {
                Organic myPet = (Organic) shelter.get(i);
                myPet.feed();
            }
        }
    }

    public void waterPets() {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i) instanceof Organic) {
                Organic myPet = (Organic) shelter.get(i);
                myPet.water();
            }
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
    }

    // AMOK ADDITIONS

    public void takeCareOfBots() {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i) instanceof Robotic) {
                Robotic roboPet = (Robotic) shelter.get(i);
                roboPet.addOil();
            }
        }
    }

    public void cleanCages() {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i) instanceof OrganicDog) {
                OrganicDog orgoPet = (OrganicDog) shelter.get(i);
                orgoPet.cleanCage();
            }
        }
    }

    public void emptyLitter() {
        litterbox = 0;
    }

    public void walkDogs() {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i) instanceof RoboticDog) {
                RoboticDog roboPet = (RoboticDog) shelter.get(i);
                roboPet.walkDog();
            } else if (shelter.get(i) instanceof OrganicDog) {
                OrganicDog orgoPet = (OrganicDog) shelter.get(i);
                orgoPet.walkDog();
            }
        }
    }
}
