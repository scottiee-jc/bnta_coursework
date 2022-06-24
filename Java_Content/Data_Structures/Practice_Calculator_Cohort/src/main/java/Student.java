public class Student {

    private String name;
    private int age;
    private String location;
    private String university;

    public Student(String name, int age, String location, String university){
        this.name = name;
        this.age = age;
        this.location = location;
        this.university = university;
    }

    // Getters & Setters

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }


    // Behaviours

    public boolean livesInLondon(){
        if (this.location.equals("London")){
            return true;
        } else {
            return false;
        }
    }


    public void countToNumber(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
