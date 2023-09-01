package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Important Variables
        int choice;
        Scanner input = new Scanner(System.in);

        OrganicDog cookie = new OrganicDog("Cookie", "Zoomies master", 50, 20);
        RoboticDog brook = new RoboticDog("Brook", "Immortal best friend");
        OrganicCat peanut = new OrganicCat("Peanut", "Acts like a human", 50, 20);
        RoboticCat cloe = new RoboticCat("Cloe", "Loves to sleep on the couch");

        VirtualPetShelter shelter = new VirtualPetShelter();

        shelter.addPet(cookie);
        shelter.addPet(brook);
        shelter.addPet(peanut);
        shelter.addPet(cloe);

        VirtualPetShelter.setLitterBox(10);

        // Game Loop

        do {

            // Shelter Output
            System.out.println("This is the status of your pets!");
            System.out.println();
            shelter.showAllPets();
            System.out.println();

            System.out.println("What would you like to do next?");
            System.out.println("1)Feed the pets");
            System.out.println("2)Water the pets");
            System.out.println("3)Play with a pet");
            System.out.println("4)Adopt a pet");
            System.out.println("5)Admit a pet");
            System.out.println("6)Walk all dogs");
            System.out.println("7)Clean dog cages");
            System.out.println("8)Clean shelter litterbox");
            System.out.println("9)Oil all robotic pets");
            System.out.println();
            choice = input.nextInt();
            input.nextLine();

            // User input
            switch (choice) {
                case 1:
                    System.out.println("You feed all the pets!");
                    System.out.println();
                    shelter.feedPets();
                    break;
                case 2:
                    System.out.println("You gave water to all the pets!");
                    System.out.println();
                    shelter.waterPets();
                    break;
                case 3:
                    System.out.println("Please choose a pet to play with");
                    System.out.println();
                    shelter.showNameAndDesc();
                    String playName;
                    playName = input.nextLine();
                    shelter.playWithPet(playName);
                    break;
                case 4:
                    System.out.println("Choose who you want to adopt");
                    System.out.println();
                    shelter.showNameAndDesc();
                    String adName;
                    adName = input.nextLine();
                    System.out.println();
                    shelter.adoptPet(adName);
                    break;
                case 5:
                    System.out.println("Please enter a name for the pet");
                    String name;
                    name = input.nextLine();
                    System.out.println("Please enter a brief description of the pet");
                    String desc;
                    desc = input.nextLine();
                    System.out.println();
                    System.out.println("What kind of pet is it? Enter numeric choice");
                    System.out.println("1-Robotic Dog 2-Robotic Cat 3-Organic Dog 4-Organic Cat");
                    int pChoice;
                    pChoice = input.nextInt();
                    if (pChoice == 1) {
                        RoboticDog x = new RoboticDog(name, desc);
                        shelter.addPet(x);
                    } else if (pChoice == 2) {
                        RoboticCat x = new RoboticCat(name, desc);
                        shelter.addPet(x);
                    } else if (pChoice == 3) {
                        OrganicDog x = new OrganicDog(name, desc, 50, 20);
                        shelter.addPet(x);
                    } else if (pChoice == 4) {
                        OrganicCat x = new OrganicCat(name, desc, 50, 20);
                        shelter.addPet(x);
                    }
                    break;
                case 6:
                    // Walk all dogs
                    shelter.walkDogs();
                    break;
                case 7:
                    // Clean dog cages
                    shelter.cleanCages();
                    break;
                case 8:
                    // Clean shelter litterbox
                    shelter.emptyLitter();
                    break;
                case 9:
                    // Oil all robotic pets
                    shelter.takeCareOfBots();
                    break;
                default:
                    System.out.println();
            }

            // tick() after every iteration
            shelter.tick();
        } while (choice != 0);

        input.close();
    }
}
