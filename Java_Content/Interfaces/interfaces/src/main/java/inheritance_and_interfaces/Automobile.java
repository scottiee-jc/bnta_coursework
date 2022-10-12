package inheritance_and_interfaces;

import java.util.Calendar;

public interface Automobile {

    // anything within a public class will be public - unless you specify otherwise with an access modifier (e.g. private)

    String getMake();
    String getModel();
    Double getPrice();

    // DEFAULT - this means if any class implements and doesn't override this method, the default implementation should be used
    // implements helper method in its return statement
    // possible for an interface to define static methods as well as implement default implementations of instance methods
    default String getReleaseDate() {
        return getFormattedCalenderString();
    }

    static String getFormattedCalenderString() {
        Calendar now = Calendar.getInstance();

        return String.format("%s-%s-%s", now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.YEAR));

        //passing in the dates into a nicely formatted string
    }

    String safetyAssessmentProgram = "Global NCAP";

    // principle in programming called the Open/Closed principle
    // classes should be open for extension, but closed for modification
    // statement also applies to interfaces - don't change it after its being implemented! causes backward compatibility

    // interface does NOT contain any implentation - it is to define the methods that are supported by any classes that implement that interface

}
