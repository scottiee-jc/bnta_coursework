package animals;

public class Penguin extends Bird{

    public Penguin(String name, int age, String diet){
        super(name, age, diet);
    }

    @Override
    public String makeNoise() {
        return "Noot noot!";
    }
}
