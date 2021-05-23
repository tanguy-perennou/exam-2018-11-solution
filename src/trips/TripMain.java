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
    }
}
