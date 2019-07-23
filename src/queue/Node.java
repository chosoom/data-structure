package queue;

public class Node {

	private Object data;
	Node nextNode;
	
	public Node() {
		data = null;
		nextNode= null;
	}
	
	public Node(Object d) {
		data = d;
		nextNode = null;
	}
	
	public Object getData() {
		return data;
	}
}
