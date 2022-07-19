package finalsection;

import java.util.function.Consumer;

public class Callbacks {

    //callbacks with JS

    // e.g.

    // function hello(firstname, lastname, callback){
    // console.log(firstname);
    // if (lastName) {
    // console.log(lastName);
    // } else {
    //     callback();
    // }


    public static void main(String[] args) {

        // achieving a similar function to JS callbacks

        // using consumer function to achieve callback
        hello("John", null, value -> {
            System.out.println("Last name not provided for " + value);
        });

        // using runnable to acheive callback
        hellov2("John",
                null,
                () -> System.out.println("Last name not provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callBack) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callBack.accept(firstName);
        }
    }

    static void hellov2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
