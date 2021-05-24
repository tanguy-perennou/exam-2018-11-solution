package exceptions;

public class GPSCoordinatesMain {
	
	public static void main(String[] args) {
		System.out.println(new GPSCoordinates(27.986065, 86.922623, 8848)); // Mount Everest, Himalayas
		System.out.println(new GPSCoordinates(-78.525398, -85.617390, 4892)); // Mount Vinson, Antarctic
		System.out.println(new GPSCoordinates(63.069115, -151.006240, 6190)); // Mount Denali, Alaska

		// test all possible out-of-domain values and
		// check that an exception with an appropriate message
		// stops the normal execution
		
		//System.out.println(new GPSCoordinates(0, 0, -10000));
		//System.out.println(new GPSCoordinates(0, 0, 10000));
		//System.out.println(new GPSCoordinates(0, -190, 0));
		//System.out.println(new GPSCoordinates(0, 190, 0));
		//System.out.println(new GPSCoordinates(-100, 0, 0));
		System.out.println(new GPSCoordinates(100, 0, 0));
	}

}
