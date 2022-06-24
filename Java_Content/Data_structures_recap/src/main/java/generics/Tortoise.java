package generics;

public class Tortoise extends Reptile implements HasLegs{

    private String name;

    public Tortoise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
