package enclosures;

import animals.Animal;
import animals.Bird;

import java.util.ArrayList;

//we need a concrete class so abstract doesn't apply here
public class Birdhouse extends Enclosure{

    public Birdhouse(String name) {
        super(name);
    }

    public void addAnimal(Bird bird){
        this.animals.add(bird);
    }
}
