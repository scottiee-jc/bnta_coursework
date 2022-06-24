public class Car implements Vehicle {

    @Override
    public String startEngine() {
        System.out.println("Vroom vroom");
        return "Vroom vroom";
    }

    public boolean isHeadlightOn(){
        System.out.println("The light is off");
        return false;
    }
}
