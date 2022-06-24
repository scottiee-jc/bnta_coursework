package enums;

public class Person {

    private String name;
    private String homeTown;
    private Month birthMonth;

    // using the refactor -> type migration -> enums.Month to set available values to the enum values

    public Person(String name, String homeTown, Month birthMonth){
        this.name = name;
        this.birthMonth = birthMonth;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Month getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Month birthMonth) {
        this.birthMonth = birthMonth;
    }
}
