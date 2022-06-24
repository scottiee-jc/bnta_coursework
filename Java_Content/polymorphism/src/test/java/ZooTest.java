import enclosures.BirdHouse;
import enclosures.MammalField;
import enclosures.ReptileShed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import staff.Staff;
import zoo.Zoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {

    private Zoo zoo;
    private Staff janitor;
    private Staff ticketSeller;
    private MammalField mammalField;
    private ReptileShed reptileShed;
    private BirdHouse birdHouse;
    private Staff reptileKeeper;
    private Staff mammalKeeper;
    private Staff birdKeeper;

    @BeforeEach
    void setup(){
        janitor = new Staff("test janitor", "janitor");
        ticketSeller = new Staff("test seller", "ticket seller");
        reptileKeeper = new Staff("test keeper 1", "reptile keeper");
        mammalKeeper = new Staff("test keeper 2", "mammal keeper");
        birdKeeper = new Staff("test keeper 3", "bird keeper");
        mammalField = new MammalField("test field", mammalKeeper);
        reptileShed = new ReptileShed("test shed", reptileKeeper);
        birdHouse = new BirdHouse("test house", birdKeeper);
        zoo = new Zoo("test zoo", 100, birdHouse, mammalField, reptileShed, ticketSeller, janitor);
    }

    @Test
    void sellingTicketIncreasesCash(){
        zoo.sellTicket();
        assertEquals(110, zoo.getCash());
    }

}
