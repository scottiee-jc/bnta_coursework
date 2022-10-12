package inheritance_and_interfaces;

// to add further implmentations of interfaces that are UNRELATED, you would seperate the interface names by a comma
// e.g; public class Lamborghini implements SportsCar, Motorbike
public class Lamborghini implements SportsCar {

    private String make;
    private String model;
    private Double price;
    private float getTopSpeed;
    private String releaseDate;

    public Lamborghini(String model, Double price, float getTopSpeed, String releaseDate) {
        this.make = "Lamborghini";
        this.model = model;
        this.price = price;
        this.getTopSpeed = getTopSpeed;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Lamborghini{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", getTopSpeed=" + getTopSpeed +
                ", releaseDate='" + releaseDate + '\'' +
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

    @Override
    public float getTopSpeed() {
        return 0;
    }

    @Override
    public String getReleaseDate() {
        return releaseDate;
    }
}
