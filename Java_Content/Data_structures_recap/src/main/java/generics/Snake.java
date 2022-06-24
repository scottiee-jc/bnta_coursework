package generics;

public class Snake extends Reptile{

    private String name;

    public Snake(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
