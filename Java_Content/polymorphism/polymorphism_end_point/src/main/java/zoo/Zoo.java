package zoo;

import animals.Bird;
import animals.Mammal;
import animals.Reptile;
import enclosures.BirdHouse;
import enclosures.MammalField;
import enclosures.ReptileShed;
import staff.Janitor;
import staff.Staff;
import staff.TicketSeller;

public class Zoo {

    private String name;
    private int cash;
    private BirdHouse birdHouse;
    private MammalField mammalField;
    private ReptileShed reptileShed;

    private TicketSeller ticketSeller;
    private Janitor janitor;

    public Zoo(String name, int cash, BirdHouse birdHouse, MammalField mammalField, ReptileShed reptileShed, TicketSeller ticketSeller, Janitor janitor) {
        this.name = name;
        this.cash = cash;
        this.birdHouse = birdHouse;
        this.mammalField = mammalField;
        this.reptileShed = reptileShed;
        this.ticketSeller = ticketSeller;
        this.janitor = janitor;
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public BirdHouse getBirdHouse() {
        return birdHouse;
    }

    public void setBirdHouse(BirdHouse birdHouse) {
        this.birdHouse = birdHouse;
    }

    public MammalField getMammalField() {
        return mammalField;
    }

    public void setMammalField(MammalField mammalField) {
        this.mammalField = mammalField;
    }

    public ReptileShed getReptileShed() {
        return reptileShed;
    }

    public void setReptileShed(ReptileShed reptileShed) {
        this.reptileShed = reptileShed;
    }

    public TicketSeller getTicketSeller() {
        return ticketSeller;
    }

    public void setTicketSeller(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public Janitor getJanitor() {
        return janitor;
    }

    public void setJanitor(Janitor janitor) {
        this.janitor = janitor;
    }

    // Behaviours

    public void cleanUp(){
        this.janitor.cleanUp();
    }

    public void sellTicket(){
        this.ticketSeller.sellTicket();
        setCash(this.cash + 10);
    }

}
