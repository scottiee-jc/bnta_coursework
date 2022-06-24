package animals;

import animals.Animal;
import animals.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LionTest {

    private Animal lion;

    @BeforeEach
    void setup(){
        lion = new Lion("Simba", 28, "zebra", false);
    }

    @Test
    void canMakeNoise(){
        assertEquals("Roar!", lion.makeNoise());
    }


}
