package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        int counter = 0;

        // name = the argument coming from the data type
        Function<String, String> upperCaseName =
                name -> {
            if (name.isBlank()) throw new IllegalArgumentException("Pls provide a name");
            return name.toUpperCase();
                };

        System.out.println(upperCaseNameV2.apply("scort", 23));
        System.out.println(upperCaseName.apply(""));
    }

    static BiFunction<String, Integer, String> upperCaseNameV2 =
            (name, age) -> {
                if (name.isBlank()) throw new IllegalArgumentException("Pls provide a name");
                System.out.println(age);
                return name.toUpperCase();
            };

    // static only works outside of the psvm so don't need it too much
}
