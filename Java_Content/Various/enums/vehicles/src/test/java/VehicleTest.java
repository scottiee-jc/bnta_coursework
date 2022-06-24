import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testVehicleList() {
        List<Vehicle> vehicles = List.of(new Boat(), new Motorbike(), new Car());

        //this iterates for every vehicle in the list to check if a specific vehicle is there and to return the startVehicle() variable
        // reference variable v points to an object of concrete type; boat, motorbike or car

        for (Vehicle vehicle: vehicles) {
            vehicle.startEngine();
            if (vehicle instanceof Car){
          //      ((Car) vehicle).isHeadlightOn()
                Car car = (Car) vehicle;
                car.isHeadlightOn();
            } else if (vehicle instanceof Boat) {
                Boat boat = (Boat)vehicle;
                boat.raiseTheSail();
            } else if (vehicle instanceof Motorbike) {
                Motorbike motorbike = (Motorbike)vehicle;
                motorbike.doStunt();
            }

        }

    }
}