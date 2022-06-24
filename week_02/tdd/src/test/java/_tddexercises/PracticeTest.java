package _tddexercises;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {


    PracticeTest classUnderTheTest = new PracticeTest();

    @Test
    void diff21_19_2(){
        // given
        int firstParam = 21;
        int secondParam = 19;

        // when
        int actualValue1 = classUnderTheTest.diff21_19_2(firstParam);

        // then
        assertTrue(actualValue1);

    }

    @Test
    void sleepIn_true_false(){
        // given
        boolean firstParam = true;
        boolean secondParam = false;

        // when
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

        // then
        assertFalse(actualValue);

    }

    @Test
    void sleepIn_false_true(){
        // given
        boolean firstParam = false;
        boolean secondParam = true;

        // when
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

        // then
        assertTrue(actualValue);

    }

    @Test
    void sleepIn_true_true(){
        // given
        boolean firstParam = true;
        boolean secondParam = true;

        // when
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

        // then
        assertTrue(actualValue);

    }

}

}