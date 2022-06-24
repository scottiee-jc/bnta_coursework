package enclosures;

import animals.Bird;
import staff.Keeper;
import staff.Staff;

public class BirdHouse extends Enclosure{

    public BirdHouse(String name, Keeper keeper){
        super(name, keeper);
    }

    public void addAnimal(Bird bird){
        this.animals.add(bird);
    }
}
