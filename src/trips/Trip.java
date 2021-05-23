package trips;

import java.util.ArrayList;

public class Trip {
    // attribute modelled by an association arrow in the UML class diagram
    // the attribute name "flights" is the role specified in the UML diagram
    // the * in the UML diagram is modelled in Java by an ArrayList<Flight>,
    // which is the most convenient solution here: an array list allows to
    // control the order of the flights, while being much easier to use than
    // an array of flights.
    private ArrayList<Flight> flights;

    // constructor: do not forget to initialize all attributes
    // if you forget to create the list with "new", errors will happen later, 
    // then you call addFlight() or toString()
    public Trip() {
        flights = new ArrayList<>();
    }

    // methods
    @Override
    public String toString() {
        // three cases to be considered, as described in the exam text
        int nbFlights = flights.size();
        if (nbFlights == 0) {
            return "No flight yet";
        } else if (nbFlights == 1) {
            return String.format("%s - %s (direct)", flights.get(0).getDepartureAirport(),
                    flights.get(0).getArrivalAirport());
        } else {
            return String.format("%s - %s (%d flights)", flights.get(0).getDepartureAirport(),
                    flights.get(nbFlights - 1).getArrivalAirport(), nbFlights);
        }
    }

    public void addFlight(Flight tp) {
        flights.add(tp);
    }

    // Trip validation based on the number of flights, and on the chain 
    // of connexions when there are more than two flights.
    public boolean isValid() {
        int nbFlights = flights.size();
        if (nbFlights == 0) {
            return false;
        } else if (nbFlights == 1) {
            return true;
        } else {
            // key point: i must be between 0 and nbFlights-2, not -1 as usual
            for(int i = 0; i < nbFlights-1; i++) {
                if(!flights.get(i).isConnectedTo(flights.get(i + 1))) {
                    return false; // stops the loop and exits the function
                }
            }
            return true; // all flights were connected: can return true
        }
    }

}
