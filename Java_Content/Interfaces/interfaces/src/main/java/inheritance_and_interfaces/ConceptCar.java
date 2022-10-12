package inheritance_and_interfaces;

public abstract class ConceptCar implements Automobile {

    private String make;
    private String model;

    public ConceptCar(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    // these methods are NOT implemented for ConceptCar
    // override still made use of - any class that extends ConceptCar has to implement these methods
    @Override
    public abstract Double getPrice();

    @Override
    public abstract String getReleaseDate();
}
