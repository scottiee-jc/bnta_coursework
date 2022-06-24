package enums;

public enum Month {
    //min we need to provide is the allowed values - in CAPS
    // still a class - but if we want to use a data type, we can ONLY use the values we have set here
    // RULES...
    // 1. value HAS to begin with a LETTER, not number
    // 2. must be accessed in other files using the name of the enum (Month) and . and the value from the enum list
    // 3. we CAN associate values with enums! e.g. the order in which the months come

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int monthNumber;

    // what if we want to know if January is the first month?
    // can associate a value with it using brackets and insert an index number
    // using a constructor, it generates int i as an index number
    // need to provide the constructor with info to set these values
    // want it to return the month number so we use a getter
    // final variable to make sure this value chain is set and no one can edit this chain

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber(){
        return this.monthNumber;
    }

}
