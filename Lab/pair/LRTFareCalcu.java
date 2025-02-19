package pair;

public class LRTFareCalcu {
    public double calcBaseFare(String ticketType, int distance, boolean withDiscount){

        if (ticketType.equals("SINGLE_JOURNEY")){
            return 15.00;
        } else
            return 500.00;
    }

    public double fareWithDiscount(double fare, boolean withDiscount){
        double disc;
        if (withDiscount){
            disc = fare * 0.2;
            return fare -= disc;
        }
        return fare;
    }

    public double calcSingleJourney(double baseFare, int distance){
        double rate = 1.27;
        return baseFare + (rate * distance);
    }

    public double calcMonthlyJourney(int distance){
        double fare = 15.00;
        double rate = 1.27;
        return fare + (rate * distance);
    }
}
