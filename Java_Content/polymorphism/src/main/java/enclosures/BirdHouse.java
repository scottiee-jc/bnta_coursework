package enclosures;

import animals.Bird;
import staff.Staff;

public class BirdHouse extends Enclosure{

    public BirdHouse(String name, Staff keeper){
        super(name, keeper);
    }

    public void addAnimal(Bird bird){
        this.animals.add(bird);
    }
}
