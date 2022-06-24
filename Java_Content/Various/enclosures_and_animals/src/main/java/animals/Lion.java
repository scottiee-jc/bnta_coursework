package animals;

public class Lion extends Animal{

    private boolean canWaitToBeKing;
    public Lion(String name, int age, String diet, boolean canWaitToBeKing) {
        super(name, age, diet);
        this.canWaitToBeKing = canWaitToBeKing;
    }

    public boolean isCanWaitToBeKing() {
        return canWaitToBeKing;
    }

    public void setCanWaitToBeKing(boolean canWaitToBeKing) {
        this.canWaitToBeKing = canWaitToBeKing;
    }

    @Override
    public String makeNoise(){
        return "Roar!";
    }

    public String introduce(){
        return "A Rawwwr! a rae " + this.name;
    }

    public void reproduce(){
        System.out.println("I'm having a cub");
    }

}
