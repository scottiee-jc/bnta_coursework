package inheritance_and_interfaces;

// inheritance of Automobile methods - if any concrete classes try to implement SportsCar methods, they need to implement all of automobile methods
public interface SportsCar extends Automobile {

    float getTopSpeed();
}
