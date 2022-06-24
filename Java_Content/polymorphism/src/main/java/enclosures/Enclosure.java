package enclosures;

import animals.Animal;
import staff.Staff;

import java.util.ArrayList;

public abstract class Enclosure {

    private String name;
    private boolean open;
    protected ArrayList<Animal> animals;
    private Staff keeper;

    public Enclosure(String name, Staff keeper){
        this.name = name;
        this.open = false;
        this.animals = new ArrayList<>();
        this.keeper = keeper;
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Staff getKeeper() {
        return keeper;
    }

    public void setKeeper(Staff keeper) {
        this.keeper = keeper;
    }

    // Behaviours

    public int countAnimals(){
        return this.animals.size();
    }

    public void open(){
        this.open = true;
    }

    public void close(){
        this.open = false;
    }

    public void feedAnimals(){
        for (Animal animal : this.animals){
            this.keeper.feedAnimal(animal);
        }
    }

}
