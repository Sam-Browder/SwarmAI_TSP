

public class Node {
	public Node[] neighbor;
	public int[] dist;
	public int id;

	public Node(int i, int numberOfCities) {
		id = i;
		neighbor = new Node[numberOfCities];
		dist = new int[numberOfCities];
	}

	public void setNeighbor(Node node, int distance) {
		neighbor[node.getID()] = node;
		dist[node.getID()] = distance;
	}

	public Node[] getNeighbors() {
		return neighbor;
	}

	public int getNeighborID(int j) {
		return neighbor[j].getID();
	}

	public int getID() {
		return id;
	}

	public int getDistance(int j) {
		return dist[j];
	}
	
}
