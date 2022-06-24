package animals;

public class Zebra extends Mammal{

    public Zebra(String name, int age, String diet){
        super(name, age, diet);
    }

    // Behaviours

    @Override
    public String makeNoise() {
        return "Snort!";
    }
}
