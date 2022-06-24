import enclosures.BirdHouse;
import enclosures.MammalField;
import enclosures.ReptileShed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import staff.Janitor;
import staff.Keeper;
import staff.Staff;
import staff.TicketSeller;
import zoo.Zoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {

    private Zoo zoo;
    private Janitor janitor;
    private TicketSeller ticketSeller;
    private MammalField mammalField;
    private ReptileShed reptileShed;
    private BirdHouse birdHouse;
    private Keeper reptileKeeper;
    private Keeper mammalKeeper;
    private Keeper birdKeeper;

    @BeforeEach
    void setup(){
        janitor = new Janitor("test janitor");
        ticketSeller = new TicketSeller("test seller");
        reptileKeeper = new Keeper("test keeper 1");
        mammalKeeper = new Keeper("test keeper 2");
        birdKeeper = new Keeper("test keeper 3");
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
