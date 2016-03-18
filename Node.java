import java.util.ArrayList;



public class Node {
	public ArrayList<Node> neighbor;
	public ArrayList<Integer> dist;
	public int id;

	public Node(int i, int numberOfCities) {
		id = i;
		neighbor = new ArrayList<Node>();
		dist = new ArrayList<Integer>();
	}

	public void setNeighbor(Node node, int distance) {
		neighbor.add(node);
		dist.add(distance);
	}

	public Node[] getNeighbors() {
		neighbor.add(null);
		return  neighbor.toArray(new Node[neighbor.size()]);
	}

	public int getNeighborID(int j) {
		return neighbor.get(j).getID();
	}

	public int getID() {
		return id;
	}

	public int getDistance(int j) {
		return dist.get(j);
	}
	
}
