import java.util.*;

public class GenerateInstance {

	public static void main(String args[]) {
		
		int numberOfCities = 300;
		
		// Ok, I am fixing the seed, so that instead of reading in the
		// data from the text files, you can use this function to
		// generate the data I posted.
		Random r = new Random(0);
		
		for (int i = 0; i < numberOfCities; i++) {
			for (int j = i + 1; j < numberOfCities; j++) {
				System.out.println(i + " " + j + " " + (r.nextInt(100) + 1));
			}
		}
	}
}	
