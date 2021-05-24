package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GPSCoordinatesReaderMain {
	
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("src/exceptions/summits.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		
		String line = reader.readLine(); 
		while(line != null) { // compilation error fixed by declaring "line" above, not "ligne"
			String[] words = line.split(",");
			double lat = Double.parseDouble(words[1]);
			double lon = Double.parseDouble(words[2]);
			double alt = Double.parseDouble(words[3]);
			GPSCoordinates coords = new GPSCoordinates(lat, lon, alt);
			System.out.println(coords);
			line = reader.readLine();
		}
		
		reader.close();
	}

}
