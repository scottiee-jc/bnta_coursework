package animals;

public class Parrot extends Bird {

    public Parrot(String name, int age, String diet){
        super(name, age, diet);
    }

    @Override
    public String makeNoise() {
        return "Squawk!";
    }


}
