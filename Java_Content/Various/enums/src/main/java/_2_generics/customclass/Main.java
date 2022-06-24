package _2_generics.customclass;

public class Main {
    public static void main(String[] args) {
        GenericClass<Person, String> genericClassRefVariable = new GenericClass<>();
        genericClassRefVariable.useGenerics(new Person(), "");
    }
}
