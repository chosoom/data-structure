package list;

public class Node {

	private Object data;
	Node nextNode;
	
	public Node() {
		this.data = null;
		this.nextNode = null;
	}
	public Node(Object d) {
		this.data = d;
	}
	
	public Object getData() {
		return this.data;
	}

}
