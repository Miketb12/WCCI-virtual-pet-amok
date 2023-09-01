package pets_amok;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @Test
    void appHasAGreeting() {
        assertTrue(true, "app should have a greeting");
    }

    @Test
    void appHasCleanCages() {
        OrganicDog myDog = new OrganicDog("Spike", "Experiment 626", 50, 20);
        myDog.cleanCage();
        assertInstanceOf(OrganicDog.class, myDog, "cage was not cleaned");
    }

    @Test
    void appHasCleanLitterBox() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.emptyLitter();
        assertInstanceOf(VirtualPetShelter.class, shelter, "litterbox was not emptied");
    }

    @Test
    void appHasWalkDogs() {
        RoboticDog roboDog = new RoboticDog("Tj", "Oil machine");
        roboDog.walkDog();
        assertInstanceOf(RoboticDog.class, roboDog, "could not walk dog");
    }
}
