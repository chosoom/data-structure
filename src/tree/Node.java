package tree;

public class Node {

	private Object data;
	
	Node leftChild;
	Node rightSibling;
	
	public Node() {
		data= null;
		leftChild = null;
		rightSibling = null;
	}
	
	public Node(Object d) {
		data = d;
		leftChild = null;
		rightSibling=null;
	}
	
	public Object getData() {
		return data;
	}
}
