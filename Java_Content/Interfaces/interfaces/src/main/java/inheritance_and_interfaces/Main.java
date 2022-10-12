package inheritance_and_interfaces;

public class Main {

    public static void main(String[] args) {

        Automobile sedan = new Sedan("Honda", "Civic", 20000.0);

        // for runtime polymorphism its good to have the variable of our base class type (automobile)
        // although we can never directly instantiate objects of an interface type, its okay to have variables of this interface type

        System.out.println("Sedan make: " + sedan.getMake());
        System.out.println("Sedan model: " + sedan.getModel());
        System.out.println("Sedan price: " + sedan.getPrice());

        System.out.println("sedan is an instance of Sedan? " + (sedan instanceof Sedan));
        System.out.println("sedan is an instance of Automobile? " + (sedan instanceof Automobile));

        // cannot implement interface variables - they are abstract
    }

}
