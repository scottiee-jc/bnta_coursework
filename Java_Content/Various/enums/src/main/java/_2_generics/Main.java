package _2_generics;

import _2_generics.customclass.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList nonGenericList = new ArrayList();

        // each class inherits from a class object

        nonGenericList.add(1);
        nonGenericList.add("String");
        nonGenericList.add(new Person());

        //we can assign all types to an Object, this types gives us only a few basic methods
        //assigning what we get from the list "1" to the reference variable of type Object

        Object object = nonGenericList.get(1);

        //casting ref variable object to Person

        Person person = (Person) object;
        person.personMethod();

// whatever the data type, we can assign it to an object variable
//REFERENCE TYPE = CAPS, REFERENCE = LOWERCASE, REFERENCE. calls a method

    ArrayList<Person> personTypeOnly = new ArrayList<>();
   // compiler errors: only objects of type Person are allowed!
    // personTypeOnly.add(1);
    personTypeOnly.add(new Person());
  //  personTypeOnly.add("");

    }
}
