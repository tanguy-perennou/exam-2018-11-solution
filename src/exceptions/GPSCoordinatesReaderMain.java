package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GPSCoordinatesReaderMain {
	
	public static void main(String[] args) throws IOException { // compilation error on lines 10 et 13 fixed by adding throws clause
		FileReader fileReader = new FileReader("src/exceptions/summits.txt");
		BufferedReader reader = new BufferedReader(fileReader); // compilation warning on line 10 fixed by initializing reader with fileReader
		
		String line = reader.readLine(); // compilation error on lines 14, 15 and 21 fixed by declaring "line" instead of "ligne"
		while(line != null) { 
			String[] words = line.split(","); // will produce a 3-element array (see any line in summits.txt)
			double lat = Double.parseDouble(words[0]); // use index 0 for first element
			double lon = Double.parseDouble(words[1]);
			double alt = Double.parseDouble(words[2]); // fixes exception thrown at execution time when using index 3
			GPSCoordinates coords = new GPSCoordinates(lat, lon, alt); // use the three above variables
			System.out.println(coords);
			line = reader.readLine();
		}
		
		reader.close(); // compilation warning on line 11 fixed by closing reader after use
	}

}
