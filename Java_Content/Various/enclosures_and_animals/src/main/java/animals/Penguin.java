package animals;

public class Penguin extends Bird {
    //extend tells the compiler it is a sub class that needs extending

    public Penguin(String name, int age, String diet) {
        super(name, age, diet);
    }

    public String introduce(){
        return "Noot de la noot!";
    }

 }

