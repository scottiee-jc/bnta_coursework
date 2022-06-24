import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CohortTest {

    private Cohort cohort;

    // resetting cohort property to be ready for the next test
    @BeforeEach
    void setup(){
        cohort = new Cohort("test cohort");
    }

    //marks out a testing framework for java to recognise
    @Test
    void startsWithNoStudents() {
        // Given the test target - a new cohort
        Cohort cohort = new Cohort("test cohort");

        // When: we do a thing ... nothing in this case, because the ArrayList is empty

        // Then: the outcome, it should have no students
        assertEquals(0, cohort.countStudents());
    }

    @Test
    void canAddStudent(){
        // Given - a cohort and a student
        Cohort cohort = new Cohort("test cohort");
        Student student1 = new Student("Scott", "Kendal", "Durham", 23);
        // When - we add student to the cohort
        cohort.addStudent(student1);
        // Then - the cohort should have 1 student in it
        assertEquals(1, cohort.countStudents());
    }

}
