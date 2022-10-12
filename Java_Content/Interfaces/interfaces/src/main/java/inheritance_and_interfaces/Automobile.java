package inheritance_and_interfaces;

public interface Automobile {

    // anything within a public class will be public - unless you specify otherwise with an access modifier (e.g. private)

    String getMake();
    String getModel();
    Double getPrice();

    // interface does NOT contain any implentation - it is to define the methods that are supported by any classes that implement that interface

}
