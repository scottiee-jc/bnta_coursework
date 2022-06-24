package generics;

public class GenericsMain {

    // we can set up objects so that different instances of an object
    // can have different properties. By making the second argument generic,
    // we are no longer tied down to one specific data type going in there.
    // making owner GENERIC with type <T> allows us to say that
    // we don't need specific dog methods for the dog class within owner


    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Owner<Pet> louise = new Owner<>("Louise", dog);

        Tortoise tortoise = new Tortoise("Speedy");
        Snake snake = new Snake("Sid");
        Owner<Pet> aaron = new Owner<>("Aaron", snake);

        Cat cat = new Cat("Ribena");
        Owner<Pet> owner = new Owner<>("James Milner", cat);

        // cannot put primitives in angle brackets
        // if you are using a list/map you must use a reference type
        // the wildcard ? says put in anything that satisfies this data type
        // everything is an object - apart from primitives - so everything is inherited from this
    }
}
