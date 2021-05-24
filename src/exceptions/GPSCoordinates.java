package exceptions;

public class GPSCoordinates {
	
	private double lat; // in degrees
	private double lon; // in degrees
	private double alt; // in meters

	// check values of parameters; if a value is out of domain, throw an execption
	public GPSCoordinates(double lat, double lon, double alt) {
		// Here we choose to have 3 different tests so that we can produce 
		// 3 different error messages in the thrown exception. A single if/throw
		// is also correct.
		// We also choose to use the standard IllegalArgumentException, no need
		// to write a new exception class. This standard exception is more 
		// appropriate than the more general Exception class.
		if(lat < -90 || lat > 90) {
			throw new IllegalArgumentException("latitude " + lat + " not in [-90, 90]");
		}
		if(lon < -180 || lon > 180) {
			throw new IllegalArgumentException("longitude " + lon + " not in [-180, 180]");
		}
		if(alt < -430 || alt > 8848) {
			throw new IllegalArgumentException("altitude " + alt + " not in [-430, 8848]");
		}
		this.lat = lat;
		this.lon = lon;
		this.alt = alt;
	}
	
	@Override
	public String toString() {
		return String.format("%11.6f deg %11.6f deg %4.0f m", lat, lon, alt);
	}
}
