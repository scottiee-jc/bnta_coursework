package animals;

public class Tortoise extends Reptile{

    public Tortoise(String name, int age, String diet){
        super(name, age, diet);
    }

    // Behaviours

    @Override
    public String makeNoise() {
        return "...";
    }
}
