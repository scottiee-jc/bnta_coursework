package enums;

public class EnumMain {

    public static void main(String[] args) {

        Person scott = new Person("Scott", "Kendal", Month.SEPTEMBER);
        Person aaron = new Person("Aaron", "Kendal", Month.OCTOBER);
        Person euan = new Person("Euan", "Kendal", Month.NOVEMBER);

        System.out.println("Scott was born in " + scott.getBirthMonth().getMonthNumber());
        // prints out accessing the ref variable scott, pointing to the Person object, that contains the month value,
        // which in turn is associated with the getBirthMonth property, which in turn accesses the monthNumber
    }

    // concerns the accuracy of data
    // java is statically typed
    // we want to restrict the user to one of a certain set of values - i.e., one month out of 12, spelled correctly
    // we can set a program up in such a way that it will only accept one data type
    // enum = enumerated type, a set SET of values
    // to pass in an enum value, you have to access it via enums.Month.MONTH - cannot use a string
    // gives us a whole set of values to choose from to ensure total accuracy.
    // if we WANT a value to come from a predetermined set of things, enums are very useful
}
