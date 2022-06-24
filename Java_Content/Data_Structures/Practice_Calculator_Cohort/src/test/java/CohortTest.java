import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CohortTest {


    private Cohort cohort;

    @BeforeEach
    void setup(){
        cohort = new Cohort("test cohort");
    }


    @Test
    void startsWithNoStudents(){
        // Given - a new cohort

        // When - ...

        // Then - it should have no students
        assertEquals(0, cohort.countStudents());
    }

    @Test
    void canAddStudent(){
        // Given - a new cohort and a student

        Student student = new Student("test student", 25, "Birmingham", "UEA");
        // When - we add the student to the cohort
        cohort.addStudent(student);
        // Then - the cohort should have one student in it
        assertEquals(1, cohort.countStudents());
    }

}
