package inheritance_and_interfaces;

public class Main {

    public static void main(String[] args) {

        // cannot implement interface variables - they are abstract - so you have to do this through a class - in this case, Sedan

        // for runtime polymorphism its good to have the variable of our base class type (automobile)
        // although we can never directly instantiate objects of an interface type, its okay to have variables of this interface type

        Automobile honda = new Sedan("Honda", "Civic", 20000.0);
        System.out.println("Sedan make: " + honda.getMake());
        System.out.println("Sedan model: " + honda.getModel());
        System.out.println("Sedan price: " + honda.getPrice());
        System.out.println("Honda safety program: " + honda.safetyAssessmentProgram);

        Automobile toyota = new Sedan("Toyota", "Yaris", 5000.0);
        System.out.println("Sedan make: " + toyota.getMake());
        System.out.println("Sedan model: " + toyota.getModel());
        System.out.println("Sedan price: " + toyota.getPrice());
        System.out.println("Toyota safety program: " + toyota.safetyAssessmentProgram);


        System.out.println("Autombile safety program: " + Automobile.safetyAssessmentProgram);
        System.out.println("Sedan safety program: " + Sedan.safetyAssessmentProgram);

        // lamborghini shares an implements relationship with both interfaces, so compiler allows it

        System.out.println("");

        Automobile huracan = new Lamborghini("Huracan", 200000.0, 320, "2014");
        System.out.println("Huracan: " + huracan);
        System.out.println("Huracan release date: " + huracan.getReleaseDate());

        System.out.println("");

        Automobile aventador = new Lamborghini("Aventador", 300000.0, 360, "2016");
        System.out.println("Aventador: " + aventador);
        System.out.println("Aventador release date: " + aventador.getReleaseDate());

        System.out.println("");

        Automobile sedan = new Sedan("Honda", "Civic", 20000.0);
        System.out.println(sedan);
        System.out.println("Aventador release date: " + sedan.getReleaseDate());

        // returns the string representation that is given as the default in automobile
        // some classes can override whilst others can ignore and use the default implementation

        System.out.println("");

        Automobile sedena = new Sedan("Honda", "AreVeryInterested", 5.0);

        System.out.println(sedena);
        System.out.println("Sedan release date: " + sedena.getReleaseDate());
    }

}
