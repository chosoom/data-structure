package stack;

public class Node {

	private Object data;
	Node nextNode;
	
	public Node() {
		data = null;
		nextNode=null;
	}
	
	public Node(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return this.data;
	}
}
