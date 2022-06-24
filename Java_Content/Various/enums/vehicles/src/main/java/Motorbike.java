public class Motorbike implements Vehicle {
    @Override
    public String startEngine() {
        System.out.println("Vroom broom");
        return "Vroom broom";
    }

    public String doStunt(){
        String msg = "Bike does 360 front flip";
        System.out.println(msg);
        return msg;
    }
}
