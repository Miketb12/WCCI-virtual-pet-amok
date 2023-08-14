package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Important Variables
        int choice;
        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();

        OrganicDog cookie = new OrganicDog("Cookie", "O");
        OrganicCat mickey = new OrganicCat("Mickey", "O");
        RoboticDog cloe = new RoboticDog("Cloe", "R");
        RoboticCat peanut = new RoboticCat("Peanut", "R");

        shelter.addOrgoDog(cookie);
        shelter.addRoboDog(cloe);
        shelter.addOrgoCat(mickey);
        shelter.addRoboCat(peanut);

        shelter.setLitterBox(10);

        // Game Loop

        do {

            // Shelter Output
            System.out.println("This is the status of your pets!");
            System.out.println();
            shelter.showAllPets();
            System.out.println();

            System.out.println("What would you like to do next?");
            System.out.println("1)Feed the pets ");
            System.out.println("2)Water the pets ");
            System.out.println("3)Play with a pet");
            System.out.println("4)Adopt a pet");
            System.out.println("5)Admit a pet");
            System.out.println("6)Walk all dogs");
            System.out.println("7)Clean dog cages");
            System.out.println("8)Clean shelter litterbox");
            System.out.println("9)Oil all robotic pets");
            System.out.println("10)Quit ");
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
                    System.out.println("Dog or cat?");
                    String type;
                    type = input.nextLine();
                    System.out.println("Robotic(R) or Organic(O); single character answer");
                    String botOrOrgo;
                    botOrOrgo = input.nextLine();
                    System.out.println();
                    if ((type.equals("Dog") || type.equals("dog")) && botOrOrgo.equals("O")) {
                        OrganicDog x = new OrganicDog(name, botOrOrgo);
                        shelter.addOrgoDog(x);
                    } else if ((type.equals("Dog") || type.equals("dog")) && botOrOrgo.equals("R")) {
                        RoboticDog x = new RoboticDog(name, botOrOrgo);
                        shelter.addRoboDog(x);
                    } else if ((type.equals("Cat") || type.equals("cat")) && botOrOrgo.equals("R")) {
                        RoboticCat x = new RoboticCat(name, botOrOrgo);
                        shelter.addRoboCat(x);
                    } else if ((type.equals("Cat") || type.equals("cat")) && botOrOrgo.equals("O")) {
                        OrganicCat x = new OrganicCat(name, botOrOrgo);
                        shelter.addOrgoCat(x);
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
                    shelter.oilBots();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println();
            }

            // tick() after every iteration
            shelter.tick();
        } while (choice != 0);

        input.close();
    }
}
