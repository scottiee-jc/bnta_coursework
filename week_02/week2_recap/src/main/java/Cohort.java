import java.util.ArrayList;

public class Cohort {

    // defining the properties here
    private String name;
    private ArrayList<Student> students;

    // when working with an arraylist, you don't want to pass it through a constructor
    // you initialise it in the constructor by assigning the value to the prior defined arrayList
    // we don't need to have a list of students primned and ready to go into the cohort
    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // setter needed to pass an arraylist whilst we manually assign the values in the arrayList
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // add the .size function to
    // once we are inside our method we can do whatever we want!
    // need to return an int, as defined at the start of the method
    public int countStudents(){
        return this.students.size();

    }

    // calling an object "Student"
    // specifying we are using the "students" arrayList
    // adds the student object to this arrayList
    public void addStudent(Student student){
        this.students.add(student);
    }


}
