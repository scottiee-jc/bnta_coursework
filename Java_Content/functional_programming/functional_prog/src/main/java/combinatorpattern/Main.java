package combinatorpattern;

import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer alice = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0891234567",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(alice));

        // Using combinator pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumValid())
                .and(isAdult())
                .apply(alice);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
