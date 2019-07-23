package list;

public class listMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node[] n = new Node[5];
		
		n[0] = new Node(5);
		n[1] = new Node(3);
		n[2] = new Node("¾È³ç");
		n[3] = new Node(6);
		n[4] = new Node(1.2);
		
		
		LinkedList l = new LinkedList();
		
		l.AppendNode(n[0]);
		l.print();
		l.AppendNode(n[1]);
		l.print();
		l.AppendNode(n[3]);
		l.print();
		l.InsertNode(0, n[2]);
		l.print();
		l.RemoveNode(1);
		l.print();
		l.InsertNode(6, n[4]);
		l.print();
		l.RemoveNode(9);
		l.print();
	}
}
