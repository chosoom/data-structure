package tree;

public class Tree {

	public void addChildNode(Node parent, Node newNode) {
		if(parent.leftChild == null) {
			parent.leftChild = newNode;
		}
		else {
			Node temp = new Node();
			temp = parent.leftChild;
			while(temp.rightSibling != null) {
				temp = temp.rightSibling;
			}
			temp.rightSibling = newNode;
		}
	}
	
	public void prnt(Node parent,int depth) {
		
		for(int i=0;i<depth;i++)
			System.out.print("\t");
		System.out.println(parent.getData());
		if(parent.leftChild != null)
			prnt(parent.leftChild,depth+1);
		if(parent.rightSibling != null ) 
			prnt(parent.rightSibling,depth);
	}
	
}
