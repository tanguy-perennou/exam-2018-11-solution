package trips;

public class ValidationMain {
    public static void main(String[] args) {
        // Test isSameAs with a few airports
        Airport tls = new Airport("Toulouse Blagnac", "TLS");
        Airport cdg = new Airport("Paris Charles-de-Gaulle", "CDG");
        System.out.println(tls.isSameAs(tls)); // true
        System.out.println(tls.isSameAs(null)); // false
        System.out.println(tls.isSameAs(cdg)); // false

        // Test isConnectedTo with two flights
        Airport rkv = new Airport("Reykjavik", "RKV");
        Flight tp = new Flight("AA111", tls, cdg);
        Flight pr = new Flight("AA222", cdg, rkv);
        System.out.println(tp.isConnectedTo(pr)); // true
        System.out.println(tp.isConnectedTo(null)); // false
        System.out.println(tp.isConnectedTo(tp)); // false
    }
}
