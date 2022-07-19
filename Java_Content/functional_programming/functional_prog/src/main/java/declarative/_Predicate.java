package declarative;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicate");

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000824800"));
        System.out.println(isPhoneNumberValid("09349502300"));

        // returns true, false, false
        System.out.println("");
        System.out.println("Using Predicate");

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000824800"));
        System.out.println(isPhoneNumberValidPredicate.test("09349502300"));

        System.out.println("");
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09349502300")
        );

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09000824800")
        );

        // both will return true because use of .and means to accept as true only if both are true
        // returns false, false

        System.out.println("");
        System.out.println(
                "Is phone number valid or contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("09349502300")
        );

        System.out.println(
                "Is phone number valid or contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("09000824800")
        );

        // if you use or, it accepts if one or the other are true
        // returns true, false
    }

    //BiPredicates!
//    static BiPredicate<String, String> isPhoneNumberValidPredicateV2 =
//            (phoneNumber, )

    //simple phone validation method

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    //predicate version
    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber ->
                    phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
