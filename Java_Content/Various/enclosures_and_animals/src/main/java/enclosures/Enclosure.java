package enclosures;

import animals.Animal;

import java.util.ArrayList;

public abstract class Enclosure {

    // ABSTRACT = a superclass that cannot be instantiated and is used to state or define general characteristics

    private String name;
    private boolean open;
    protected ArrayList<Animal> animals;

    // constructor

    public Enclosure(String name) {
        this.name = name;
        this.open = false;
        this.animals = new ArrayList<>();
    }

    public int countAnimals(){
        return this.animals.size();
    }

    public void open(){
        this.open = true;
    }

    public void close(){
        this.open = false;
    }

    //if you use an animal object, it'll take ALLL animals
    //you want to specify which animals will go into an enclosure
    // we don't want any kind of animal to go into a specific enclosure

}
