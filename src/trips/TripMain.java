package trips;

public class TripMain {
    // use the exact syntax of a main() function to get an executable class
    public static void main(String[] args) {
        // Create a few airports (taken from the UML sequence diagram)
        Airport tls = new Airport("Toulouse Blagnac", "TLS");
        System.out.println(tls);
        Airport cdg = new Airport("Paris Charles-de-Gaulle", "CDG");
        System.out.println(cdg);
        Airport rkv = new Airport("Reykjavik", "RKV");
        System.out.println(rkv);

        // Create a few flights
        Flight tp = new Flight("AA1111", tls, cdg);
        System.out.println(tp);
        Flight pr = new Flight("BB2222", cdg, rkv);
        System.out.println(pr);

        // Create a trip with these flights
        // System.out.println will show the three possible displays
        // of a trip : empty, direct or with several flights
        Trip trip = new Trip();
        System.out.println(trip);
        trip.addFlight(tp);
        System.out.println(trip);
        trip.addFlight(pr);
        System.out.println(trip); 
    }
}
