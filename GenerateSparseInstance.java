import java.util.*;

public class GenerateSparseInstance {
    static int numberOfCities = 100;

    public static void main(String args[]) {

	Node [] city = new Node[numberOfCities];

	for (int i = 0; i < numberOfCities; i++) {
	    city[i] = new Node(i, numberOfCities);
	}

	Random r = new Random(0);
	int distance;
	int dice;

	// To generate large, sparse random graphs we use the Erdos-Renyi model of random graphs.


	for (int i = 0; i < numberOfCities; i++) {
	    for (int j = i + 1; j < numberOfCities; j++) {
		distance = r.nextInt(100) + 1;
		dice = r.nextInt(numberOfCities);
		if (dice <= (numberOfCities/10)) {
		    city[i].setNeighbor(city[j], distance);
		    city[j].setNeighbor(city[i], distance);
		}

	    }
	    if (city[i].getNeighbors().length == 0) {
		distance = r.nextInt(100) + 1;
		dice = r.nextInt(numberOfCities);
		city[i].setNeighbor(city[dice], distance);
		city[dice].setNeighbor(city[i], distance);
	    }
	    while (city[i].getNeighbors().length == 1) {
		dice = r.nextInt(numberOfCities);
		if (dice != city[i].getNeighbors()[0].getID()) {
		    distance = r.nextInt(100) + 1;
		    city[i].setNeighbor(city[dice], distance);
		    city[dice].setNeighbor(city[i], distance);
		}
	    }
	}

	for (int i = 0; i < numberOfCities; i++){
	    Node[] temp = city[i].getNeighbors();
	    int j = 0;
	    while (temp[j] != null){
		System.out.println(i + " " + city[i].getNeighborID(j) + " " + city[i].getDistance(j));
		j++;
	    }
	}
    }
}

