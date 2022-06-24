import java.util.ArrayList;

public class Cohort {

    private String name;
    private ArrayList<Student> students;

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    // Behaviours

    public int countStudents(){
        return this.students.size();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
