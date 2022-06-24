public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Scott", "Kendal", "Durham", 23);
        // calling the constructor method by instantiating the object Student
        // this communicates with the student file in which we find the properties and the constructor
        // initial error message saying all the parameters can't be applied to emnpty brackets... squiggly line under Student()
        // essentially, we have given it the wrong number of parameters - it is looking for 4 but we have given it 0.
        // how to fix this? fill in the values of the parameters/properties!

        // calls the value that has been calculated and printed in Student
        student1.countToTen();

        Cohort cohort = new Cohort("T-TECHS");
    }
}
