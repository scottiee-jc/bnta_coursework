package animals;

public class Snake extends Reptile{

    public Snake(String name, int age, String diet){
        super(name, age, diet);
    }

    // Behaviours

    @Override
    public String makeNoise() {
        return "Hiss!";
    }
}
