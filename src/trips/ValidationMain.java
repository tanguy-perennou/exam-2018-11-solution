package trips;

public class ValidationMain {
    public static void main(String[] args) {
        // Test isSameAs with a few airports
        Airport tls = new Airport("Toulouse Blagnac", "TLS");
        Airport cdg = new Airport("Paris Charles-de-Gaulle", "CDG");
        System.out.println(tls.isSameAs(tls)); // true
        System.out.println(tls.isSameAs(null)); // false
        System.out.println(tls.isSameAs(cdg)); // false
    }
}
