package encolouresTests;

import animals.Parrot;
import animals.Penguin;
import enclosures.Birdhouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class birdhouseTest {

    @Test
    void canCountAnimals(){
        Birdhouse birdhouse = new Birdhouse("test house");
        assertEquals(0, birdhouse.countAnimals());
    }

    @Test
    void canAddDifferentTypesOfBird(){
        Birdhouse birdhouse = new Birdhouse("test house");
        Penguin penguin = new Penguin("Pingu", 36, "fish");
        Parrot parrot = new Parrot("Polly", 25, "seeds");
        birdhouse.addAnimal(penguin);
        birdhouse.addAnimal(parrot);
        assertEquals(2, birdhouse.countAnimals());
    }

    // test to practice adding different types of bird to a bird enclosure
    // we start by adding and defining the features for existing bird objects AND a bird enclosure, parrot and penguin
    // we then specify that birdhouse must add these animals to it, storing them
    // assertEquals to test that two animals are in the file (2 animals added to an empty enclosure)
}
