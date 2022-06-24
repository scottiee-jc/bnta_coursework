package staff;

public class TicketSeller extends Staff implements Seller{

    public TicketSeller(String name){
        super(name);
    }

    public String sellTicket(){
        return "Ticket sold!";
    }

    @Override
    public void goHomeAtEndOfDay() {

    }
}
