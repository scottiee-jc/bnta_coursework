package declarative;

public class Main {

    public static void main(String[] args) {

    }

    // NO STATE!
    // pure functions should not depend on a global state
    // impure functions do depend on global states
    // i.e. never inject anything outside of the function into the function
    // it will break the code / will mutate the state
    // it makes it depend on a global state
    // functions should be SELF-CONTAINED and only depend on what you define WITHIN IT

    // NO SIDE EFFECTS!
    // shouldn't have a side effect outside of your function

    // HIGHER ORDER FUNCTION
    // if a function takes one or more functions as parameters e.g. callbacks
    // if a function returns another function as a result e.g. combinator
}
