package animals;

public abstract class Bird extends Animal {

    public Bird(String name, int age, String diet){
        super(name, age, diet);
    }

    public String layEgg(){
        return "I laid an egg!";
    }

}
