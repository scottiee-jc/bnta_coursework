package _2_test_with_junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Service2Test {

    @Test
    @DisplayName("When calling good ebening(\"Scott\") on a Service2 object we should get \"Good Ebening, Scott!\"")
    //this diplay name shows the above info on the test name
    void goodEbening() {
        //given an object of type Service2
        Service2 service = new Service2();
        String expectedValue = "Good Ebening, Scott!";
        // when goodEbening is called with "scott"
        String actualValue = service.goodEbening("Scott");
        // then it should return "Good Ebening, Scott!"
        assertEquals(expectedValue, actualValue);
    }

}