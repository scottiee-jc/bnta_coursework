package animals;

import animals.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    private Animal animal;

    @BeforeEach
    void setup(){
        animal = new Animal("Pingu", 36, "penguin") {
            @Override
            public void reproduce() {

            }
        };
    }

    @Test
    void canEatSomething(){
        //Given - an animal
        //When - it eats something
        //Then - the expected string is returned
        assertEquals("Mmm, tasty fish", animal.eat());
    }

    @Test
    void canSleep(){
        assertEquals("Zzzz...", animal.sleep());
    }

    @Test
    void canMakeNoise(){
        assertEquals("Noot noot", animal.makeNoise());
    }

}

