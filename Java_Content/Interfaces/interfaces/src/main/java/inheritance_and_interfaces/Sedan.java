package inheritance_and_interfaces;

public class Sedan extends ConceptCar {

    private Double price;

    public Sedan(String make, String model, Double price) {
        super (make, model);
        // inherits from its abstract super, ConceptCar, which in turn implements Automobile
        this.price = price;
    }

    // extends - used for one class inheriting from another
    // implements - used for classes to implement the methods defined in an interface
    // java does NOT allow multiple inheritence of state for extending classes, but it DOES for implementing interfaces

    // must implement methods from Automobile, using the override feature
    // override used for implementing methods from an interface

    @Override
    public String toString() {
        return String.format(
        "Make: %s, Model: %s, Price: %s", getMake(), getModel(), price);
    }

    @Override
    public String getReleaseDate() {
        return Automobile.getFormattedCalenderString();
    }
    // because its super implements automobile, we can still access its methods through the override method
    // it has to implement this because, through inheritance, it implements automobile

    @Override
    public Double getPrice() {
        return price;
    }

}
