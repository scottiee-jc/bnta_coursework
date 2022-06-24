package animals;

import animals.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {

    private Lion lion;

    @BeforeEach
    void setup(){
        lion = new Lion("Simba", 28, "zebra", false);
    }

    @Test
    void canMakeNoise__noArgument(){
        assertEquals("Roar!", lion.makeNoise());
    }

    @Test
    void canMakeNoise__withArgument(){
        assertEquals("I'm going to say: hello world", lion.makeNoise("hello world"));
    }

}
