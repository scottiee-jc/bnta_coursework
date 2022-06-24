package staff;

import animals.Animal;

public class Staff {

    private String name;
    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Behaviours

    public String cleanUp(){
        return "I'm cleaning the place up.";
    }

    public void feedAnimal(Animal animal){
        animal.eat();
    }

    public String sellTicket(){
        return "Ticket sold!";
    }

}
