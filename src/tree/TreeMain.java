package tree;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node[] n = new Node[10];
		for(int i=0;i<n.length;i++) {
			n[i] = new Node((int)(Math.random()*50) +1);
		}
		
		Tree t = new Tree();
		
		t.addChildNode(n[0], n[1]);
		t.addChildNode(n[1], n[2]);
		t.addChildNode(n[1], n[3]);
		t.addChildNode(n[2], n[4]);
		t.addChildNode(n[0], n[5]);
		t.addChildNode(n[5], n[6]);
		t.addChildNode(n[5], n[7]);
		t.addChildNode(n[7], n[8]);
		t.addChildNode(n[7], n[9]);
		
		t.prnt(n[0], 0);
	}

}
