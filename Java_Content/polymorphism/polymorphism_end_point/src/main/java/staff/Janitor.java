package staff;

public class Janitor extends Staff implements Cleaner{

    public Janitor(String name){
        super(name);
    }

    public String cleanUp(){
        return "I'm mopping the floor";
    }

    @Override
    public void goHomeAtEndOfDay() {

    }
}
