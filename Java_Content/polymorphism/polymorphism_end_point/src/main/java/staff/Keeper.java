package staff;

import animals.Animal;

public class Keeper extends Staff implements Feeder, Cleaner{

    public Keeper(String name){
        super(name);
    }

    public void feedAnimal(Animal animal){
        animal.eat();
    }

    public String cleanUp(){
        return "These animals are really messy!";
    }

    public void goHomeAtEndOfDay(){

    }

}
