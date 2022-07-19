package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // help a lot with NullPointerExceptions

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("sending email to " + email),
        () -> System.out.println("Cannot send email"));
    }
}
