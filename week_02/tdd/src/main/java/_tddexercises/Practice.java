package _tddexercises;

public class Practice {

    public int differ(int weekday, int vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;

        // Solution notes: better to write "vacation" than "vacation == true"
        // though they mean exactly the same thing.
        // Likewise "!weekday" is better than "weekday == false".
        // This all can be shortened to: return (!weekday || vacation);
        // Here we just put the return-false last, or could use an if/else.
    }
}

}
