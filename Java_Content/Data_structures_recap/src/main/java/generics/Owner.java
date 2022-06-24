package generics;

public class Owner <T> {

    // need to give all three owners three different pets
    // we can use a generic for this!
    // each of these three things can have a common parent class - an owner
    // some might contain numbers, and some might have strings... nothing in common
    // a generic can link these together at the class with <Variable>, such as <T>
    // owner can now use a placeholder <T> as a type
    // angle brackets familiar with an arraylist - the data type goes in there


    private String name;
    private T pet;

    public Owner(String name, T pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPet() {
        return pet;
    }

    // getter and setter uses the generic type T to say pets in general all interact with an owner in one way

    public void setPet(T pet) {
        this.pet = pet;
    }
}
