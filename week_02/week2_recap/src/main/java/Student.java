public class Student {

    // step 1, create the properties
    private String name;
    private String location;
    private String university;
    private int age;

    //next, we need the constructor function - command N and select all properties above
    //always set to public! NEEDS the name of the class
    //inside the class (_) we need to contain the parameters
    //when the constructor is called, is it going to create an object with all of these parameters contained within it

    public Student(String name, String location, String university, int age) {
        this.name = name;
        this.location = location;
        this.university = university;
        this.age = age;
    }

    // The "Getter" must be public
    // Designed to "get" info, so must always return some value/information from the method
    // The getter needs to return the data type - a string in this case, and the specified one
    // "this" specifies it wants a specific property value, in this case for "name"

    public String getName() {
        return this.name;
    }

    // The "Setter"
    // if we aren't getting anything back, THIS is where we put "void", and don't need to return anything
    // because we are only setting the data type, we just specify this with "this.name = ... "
    // only need a return type when you need something corroborating back, i.e. you need a value to be returned

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // Behaviours
    // Some methods we want to restrict to private, but most public
    // use else just for clarity, but you can just put return false at the end of the brackets (as long as it fits within the parameter (boolean) statement!

    public boolean livesInLondon() {
        if (this.location.equals("London")) {
            return true;
        }
        return false;
    }

    // void because ...
    // public because ...
    // countToTen parameter name
    // i = 1: the value 1 is set to variable i
    // i <= 10: the limit in which the calculation will keep looping until it reaches
    // i++ : this will add one more
    // i+=2: this will add 2 to every output until the limit is reached
    // i*=2: this will x every number by 2 up until the limit

    public void countToTen() {
        for (int i = 1; i <= 500; i*=2) {
            System.out.println(i);
        }
    }
}
