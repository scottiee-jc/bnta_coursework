import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void livesInLondon__true(){
        // Given - a student who lives in London
        Student student = new Student("Test Student", 25, "London", "Glasgow");
        // When - we call the livesInLondon method
        boolean result = student.livesInLondon();
        // Then - it should return true
        assertTrue(result);
    }

    @Test
    void livesInLondon__false(){
        // Given - a student who doesn't live in London
        Student student = new Student("test2", 21, "Cardiff", "Queen's");
        //When - we call teh livesInLondon method
        boolean result = student.livesInLondon();
        // Then - it should return false
        assertFalse(result);
    }
}