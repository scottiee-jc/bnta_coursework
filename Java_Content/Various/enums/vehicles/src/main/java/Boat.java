public class Boat implements Vehicle {


    @Override
    public String startEngine() {
        System.out.println("brrr brrr");
        return "brrr brrr";
    }

    public String raiseTheSail(){
        String msg = "the sail is up";
        System.out.println(msg);
        return msg;
    }

    private void doSth(){

    }
}
