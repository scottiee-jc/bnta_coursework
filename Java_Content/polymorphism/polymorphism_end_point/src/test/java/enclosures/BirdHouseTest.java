package enclosures;

import animals.Parrot;
import animals.Penguin;
import org.junit.jupiter.api.Test;
import staff.Keeper;
import staff.Staff;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdHouseTest {

    @Test
    void canCountAnimals(){
        Keeper keeper = new Keeper("test keeper");
        BirdHouse birdHouse = new BirdHouse("test house", keeper);
        assertEquals(0, birdHouse.countAnimals());
    }

    @Test
    void canAddDifferentTypesOfBird(){
        Keeper keeper = new Keeper("test keeper");
        BirdHouse birdHouse = new BirdHouse("test house", keeper);
        Penguin penguin = new Penguin("Pingu", 36, "fish");
        Parrot parrot = new Parrot("Polly", 25, "seeds");
        birdHouse.addAnimal(penguin);
        birdHouse.addAnimal(parrot);
        assertEquals(2, birdHouse.countAnimals());
    }

}
