package inheritance_and_interfaces;

public class Sedan implements Automobile {

    private String make;
    private String model;
    private Double price;

    public Sedan(String make, String model, Double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    // extends - used for one class inheriting from another
    // implements - used for classes to implement the methods defined in an interface
    // java does NOT allow multiple inheritence of state for extending classes, but it DOES for implementing interfaces

    // must implement methods from Automobile, using the override feature
    // override used for implementing methods from an interface

    @Override
    public String toString() {
        return "Sedan{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
