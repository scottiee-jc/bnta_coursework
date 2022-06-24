package staff;

import animals.Animal;

public abstract class Staff implements Commuter{

    private String name;


    public Staff(String name) {
        this.name = name;
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
