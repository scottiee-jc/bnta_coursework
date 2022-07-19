package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

// function that takes other functions as an argument and returns a new function
// function inception!!

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNoValid(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNoValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }


}
