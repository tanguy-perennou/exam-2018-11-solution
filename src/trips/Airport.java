package trips;

public class Airport {
    
    // attributes
    private String name;
    private String iata;

    // constructor
    public Airport(String name, String iata) {
        this.name = name;
        this.iata = iata;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getIata() {
        return iata;
    }

    // toString(): several solutions allow to get the expected output, 
    // Here is the most usual one, that uses the + operator between strings.
    // Do not forget the whitespace in " (", or you will get "Toulouse(TLS)"
    // instead of "Toulouse (TLS).
    @Override
    public String toString() {
        return name + " (" + iata + ")";
    }

    // Airport part of trip validation: check if this object's IATA code
    // is the same as the specified "other" airport.
    // Do not forget to use logical comparison (equals() instead of ==)
    // Do not forget to check that other is not null, otherwise other.iata
    // will throw a NullPointerException
    public boolean isSameAs(Airport other) {
        return other != null && iata.equals(other.iata);
    }
}
