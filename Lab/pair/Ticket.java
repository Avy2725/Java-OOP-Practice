package pair;
enum TicketType{
    SINGLE_JOURNEY,
    MONTHLY_BEEP
    }
public class Ticket{
    private TicketType ticketType;
    private double distance;
    private double baseFare;
    private double finalFare;
    public Ticket(TicketType ticketType, double distance, double baseFare, double finalFare){
        this.ticketType = ticketType;
        this.distance = distance;
        this.baseFare = baseFare;
        this.finalFare = finalFare;
    }
    public TicketType getTicketType(){
        return ticketType;
    }
    public double getDistance(){
        return distance;
    }
    public double getBaseFare(){
        return baseFare;
    }
    public double getFinalFare(){
        return finalFare;
    }
}
