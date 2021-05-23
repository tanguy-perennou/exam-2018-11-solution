package trips;

public class Flight {
    // attributes: do not forget the associated airports 
    // modelled by arrows in the UML class diagram. The 
    // attribute names are the roles on the arrows.
    private String flightNumber;
    private Airport departureAirport;
    private Airport arrivalAirport;

    // constructor; do not forget the airports
    public Flight(String num, Airport depAirport, Airport arrAirport) {
        this.flightNumber = num;
        this.departureAirport = depAirport;
        this.arrivalAirport = arrAirport;
    }

    // getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    // toString() 
    // This version uses a slightly more complex construct than
    // in the Airport class. Here it is easier putting the expected
    // white spaces and punctuation.
    @Override
    public String toString() {
        return String.format("%s : %s - %s", flightNumber, departureAirport.getIata(), arrivalAirport.getIata());
    }

}
