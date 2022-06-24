import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

   @Test
    void livesInLondon(){
       //Given - a student who lives in londres
          Student student = new Student("Test Student", "London", "UCL", 25);
       //When - we call the livesInLondon method
       boolean result = student.livesInLondon();
       //Then - should return as "true"
       assertTrue(result);
   }

   @Test
   void livesInLondon_false(){
      Student student = new Student("Test studdent 2", "Edinburgh", "Durham", 24);
      boolean result = student.livesInLondon();
      assertFalse(result);
   }

}
